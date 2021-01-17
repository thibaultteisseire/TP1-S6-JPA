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
public class Artiste extends Personne{
    @Column(unique=true)
    @NonNull
    private String biographie;
    
    @OneToMany(mappedBy = "auteur")
    private List<Tableau> oeuvres = new LinkedList();

    public Artiste(String perso, String _rue_du_perso) {
        super(perso, _rue_du_perso);
    }
}
