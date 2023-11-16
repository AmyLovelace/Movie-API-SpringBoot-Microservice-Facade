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



    public String addMovies(List<Student> students) {
        dao.saveAll(students);
        return "All Student has been added to Database";
    }



    /*




	public String deleteStudent(int roll) {
		Student student = dao.getById(roll);
		dao.delete(student);
		return "Roll Number is deleted :"+roll;
	}

	public String updateStudent(Student student) {
		dao.save(student);
		return "Roll Number is update :"+student.getRoll();
	}


}*/
}
