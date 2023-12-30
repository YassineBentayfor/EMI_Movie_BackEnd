package com.example.emi_movies.controller;

import com.example.emi_movies.model.FavoriteMovies;
import com.example.emi_movies.service.FavoriteMoviesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FavoriteMoviesController {
    private final FavoriteMoviesService favoriteMoviesService;

    public FavoriteMoviesController(FavoriteMoviesService favoriteMoviesService) {
        this.favoriteMoviesService = favoriteMoviesService;
    }

    @GetMapping("/favorite")
    public ResponseEntity<List<FavoriteMovies>> getFavoriteMovieIds() {
        List<FavoriteMovies> favoriteMovieIds = favoriteMoviesService.getFavoriteMovie();
        return ResponseEntity.ok(favoriteMovieIds);
    }

    @PostMapping("/add/{movieId}")
    public ResponseEntity<?> addFavoriteMovie(@RequestBody FavoriteMovies favoriteMovies,
                                              @PathVariable("movieId") Long movieId) {
        favoriteMovies.setMovieId(movieId);
        favoriteMoviesService.addFavoriteMovie(favoriteMovies);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFavoriteMovie(@PathVariable("id") Long id) {
        favoriteMoviesService.deleteFavoriteMovie(id);
        return ResponseEntity.ok().build();
    }
}
