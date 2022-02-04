package com.example.entrevueSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Acteur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String nom;
    @Getter @Setter
    private String prenom;
    @ManyToOne(fetch = FetchType.LAZY)
    @Getter @Setter @JsonIgnore
    private Film film;

    @Override
    public String toString() {
        return "Acteur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", film=" + film +
                '}';
    }
}
