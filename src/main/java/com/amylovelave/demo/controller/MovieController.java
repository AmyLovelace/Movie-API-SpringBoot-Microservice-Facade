package com.amylovelave.demo.controller;

import com.amylovelave.demo.model.Movies;
import com.amylovelave.demo.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class MovieController {


    @Autowired
    private MovieService service;



    @GetMapping(value="/search/{id}")
    public Movies search(@PathVariable int id) {
        log.info("successfully added a new movie with ID:",id);
        return service.getMovie(id);
    }

    @PostMapping(value="/add")
    public ResponseEntity<String> addMovie(@RequestBody Movies movie){
        log.info("successfully added a new movie");
        String result = service.addMovie(movie);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value="/addMovies")
    public String addMovies(@RequestBody List<Movies> movies){
        log.info("successfully added a new movies");
        String result = service.addMovies(movies);
        return "added movies: "+ result;
    }


    }
