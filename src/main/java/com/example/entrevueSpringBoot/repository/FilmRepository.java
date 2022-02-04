package com.example.entrevueSpringBoot.repository;

import com.example.entrevueSpringBoot.model.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
