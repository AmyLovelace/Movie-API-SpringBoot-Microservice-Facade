package com.amylovelave.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movies {

    int id;
    String name;
    String Director;
    int rating;


}
