package com.example.emi_movies.service;


import com.example.emi_movies.model.Commentaire;
import com.example.emi_movies.model.FavoriteMovies;

import com.example.emi_movies.repository.FavoriteMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FavoriteMoviesService {

    private FavoriteMoviesRepository favoriteMoviesRepository;

    @Autowired
    public FavoriteMoviesService(FavoriteMoviesRepository favoriteMoviesRepository) {
        this.favoriteMoviesRepository = favoriteMoviesRepository;
    }

    public List<FavoriteMovies> getFavoriteMovie() {
        return favoriteMoviesRepository.findAll();
    }

    public FavoriteMovies addFavoriteMovie(FavoriteMovies favoriteMovies) {
        return favoriteMoviesRepository.save(favoriteMovies);
    }





    public void deleteFavoriteMovie(Long movieId) {
        // Find the FavoriteMovies entity by movieId and delete it if it exists
        FavoriteMovies favoriteMovie = favoriteMoviesRepository.findByMovieId(movieId);
        if (favoriteMovie != null) {
            favoriteMoviesRepository.delete(favoriteMovie);
        } else {
        }
    }
}


