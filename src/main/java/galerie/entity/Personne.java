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
public class Personne {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @OneToMany(mappedBy = "client")
    private List<Transaction> achats = new LinkedList();

    public Personne(String perso, String _rue_du_perso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
