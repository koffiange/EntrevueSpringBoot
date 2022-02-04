package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Acteur;
import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.ActeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ActeurService {
    @Autowired
    private ActeurRepository acteurRepository;

    public void persistAll(List<Acteur> acteurs){
        acteurRepository.saveAll(acteurs);
    }

    public List<Acteur> findByFilm(Film film){
        return acteurRepository.findByFilm(film);
    }

}
