package com.amylovelave.demo.service;

import com.amylovelave.demo.dao.MovieDAO;
import com.amylovelave.demo.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieDAO dao;

    public List<Movies> getMovies(){
        return dao.findAll();
    }

    public Movies getMovie(int id) {
        return dao.findById(id).get();
    }



    public String addMovie(Movies movie) {
        dao.save(movie);
        return "New Movie has been added to Database, whose id number :"+movie.getId();
    }



    public String addMovies(List<Movies> movies) {
        dao.saveAll(movies);
        return "All Movies has been added to Database";
    }



    public String deleteMovie(int id) {
        Movies movie = dao.getById(id);
        dao.delete(movie);
        return "Id Number is deleted :"+id;
    }

	public String updateStudent(Movies movie) {
		dao.save(movie);
		return "Roll Number is update :"+ movie.getId();
	}



}
