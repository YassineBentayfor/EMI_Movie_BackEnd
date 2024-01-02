package com.example.emi_movies.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data

public class FavoriteMovies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Long movieId;

    private String email;
}
