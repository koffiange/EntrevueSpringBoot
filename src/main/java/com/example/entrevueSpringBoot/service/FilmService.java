package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    /**
     * Retourne la liste des films.
     * @return
     */
    public Film findById(Long id){
        Optional<Film> optionalFilm = filmRepository.findById(id);
        return optionalFilm.orElse(null);
    }

    /**
     * Enregistre un film en base.
     * @param film
     * @return
     */
    public Film persist(Film film){
        return filmRepository.save(film);
    }


}
