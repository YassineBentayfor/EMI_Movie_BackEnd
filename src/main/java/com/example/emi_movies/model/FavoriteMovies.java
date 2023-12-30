package com.example.emi_movies.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(
        uniqueConstraints = {@UniqueConstraint(columnNames = {"movieId"})}
)
public class FavoriteMovies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private Long movieId;

    // Constructors, getters, and setters
}
