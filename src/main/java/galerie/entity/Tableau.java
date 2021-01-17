/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

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
public class Tableau {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column(unique=true)
    @NonNull
    private String support;
    
    @Column(unique=true)
    @NonNull
    private int largeur;
    
    @Column(unique=true)
    @NonNull
    private int hauteur;
    
    @ManyToMany
    private List<Exposition> accrochage = new LinkedList();

    @OneToOne(mappedBy = "oeuvre")
    private List<Transaction> vendu = new LinkedList();
    
    @ManyToOne
    private List<Artiste> auteur = new LinkedList();
}
