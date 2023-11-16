package com.amylovelave.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("id")
    int id;

    @Column
    @JsonProperty("title")

    String name;

    @Column
    @JsonProperty("director")
    String Director;

    @Column
    @JsonProperty("rating")
    int rating;


}
