package com.example.entrevueSpringBoot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String titre;
    @Getter @Setter
    private String description;
    @Transient @Getter @Setter
    private List<Acteur> acteurs;


    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", acteurs=" + acteurs +
                '}';
    }
}
