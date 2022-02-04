package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private ActeurService acteurService;

    /**
     * Retourne la liste des films.
     * @return Film
     */
    public Film findById(Long id){
        Film film = null;
        Optional<Film> optionalFilm = filmRepository.findById(id);
        if (optionalFilm.isPresent()){
            film = optionalFilm.get();
            film.setActeurs(acteurService.findByFilm(film));
        }
        return film;
    }

    /**
     * Enregistre un film en base.
     * @param film
     * @return
     */
    public Film persist(Film film){
        filmRepository.save(film);
        film.getActeurs().forEach(acteur -> acteur.setFilm(film));
        acteurService.persistAll(film.getActeurs());
        return findById(film.getId());
    }


}
