/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author Thibault
 */
@Entity
@Getter
@Setter
public class Exposition {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private int duree;
    
    @OneToMany(mappedBy = "lieuDeVente")
    private List<Transaction> ventes = new LinkedList();
    
    @ManyToMany(mappedBy = "accrochage")
    private List<Tableau> oeuvres = new LinkedList();
    
    @ManyToOne
    private List<Exposition> evenements = new LinkedList();

    public float CA(){
        float calculCA=0;
        for(Transaction t:ventes){
            calculCA += t.getPrixVente();
        }
        return calculCA;
    }
}
