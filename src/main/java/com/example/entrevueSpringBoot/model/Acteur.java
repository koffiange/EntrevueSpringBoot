package com.example.entrevueSpringBoot.model;

import javax.persistence.*;

@Entity
public class Acteur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;

    @ManyToOne
    private Film film;
}
