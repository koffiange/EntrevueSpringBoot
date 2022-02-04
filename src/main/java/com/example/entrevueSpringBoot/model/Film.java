package com.example.entrevueSpringBoot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter
public class Film {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String titre;
    private String description;
    /**
     * En raison du cas d'utilisation qui montre que pour chaque film on voudrait
     * retourner la liste des Acteurs, j'ai opté pour un OneToMany. Mais en pratique
     * je ne fait pas ce choix lors dans un projet réel. Car si pour chaque film chargé
     * JPA doit recupérer la liste des acteurs, c'est la lenteur assurée pour les
     * findAll(). Et si acteur avait des tables fille...
     * En pratique, j'évite les EAGER et LAZY. Je me contente de faire un ManyToOne
     * sur la table fille (Acteur) et je ne charge la liste des Acteurs qu'au besoin
     * Par exemple, lors d'un findById sur la table mère (Film) je charge la
     * liste des acteurs.
     */
    @OneToMany()
    private List<Acteur> acteurs;
}
