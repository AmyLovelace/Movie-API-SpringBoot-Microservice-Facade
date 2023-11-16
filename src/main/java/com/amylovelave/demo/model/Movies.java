package com.amylovelave.demo.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movies {

    @Id
    @Column
    int id;

    @Column
    String name;

    @Column
    String Director;

    @Column
    int rating;


}
