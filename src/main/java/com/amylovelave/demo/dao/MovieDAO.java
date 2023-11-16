package com.amylovelave.demo.dao;

import com.amylovelave.demo.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDAO extends JpaRepository<Movies,Integer> {

}
