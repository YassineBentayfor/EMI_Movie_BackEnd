package com.example.emi_movies.service;

import com.example.emi_movies.model.Commentaire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceCommentaireTest {
    @Autowired
    ServiceCommentaire serviceCommentaire;

    @Test
    void findAllCommentaire() {
        serviceCommentaire.findAllCommentaire();
    }
}