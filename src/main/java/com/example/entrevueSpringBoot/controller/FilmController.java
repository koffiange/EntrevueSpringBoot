package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.service.FilmService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/film") @Log
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping(path = "/{id}")
    public Film findById(@PathVariable(name = "id") Long id){
        return filmService.findById(id);
    }

    @PostMapping()
    public Film persist(@RequestBody Film film){
        return filmService.persist(film);
    }
}
