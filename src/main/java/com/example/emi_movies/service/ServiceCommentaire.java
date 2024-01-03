package com.example.emi_movies.service;

import com.example.emi_movies.model.Commentaire;
import com.example.emi_movies.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCommentaire {
    private final CommentaireRepository commentaireRepository;
    @Autowired
    public ServiceCommentaire(CommentaireRepository commentaireRepository) {

        this.commentaireRepository = commentaireRepository;
    }
    public Commentaire addCommentaire(Commentaire commentaire){

        return commentaireRepository.save(commentaire);
    }
    public List<Commentaire> findAllCommentaire(){

        return commentaireRepository.findAll();
    }
    public void deleteEmployee(Long id){

        commentaireRepository.deleteById(id);
    }
    public List<Commentaire> findCommentaireByIdFilm(Long idfilm){
        return (List<Commentaire>) commentaireRepository.findCommentaireById_film(idfilm);

    }
}
