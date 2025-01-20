package bj.highfiveuniversity.book.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import bj.highfiveuniversity.book.DTO.AuthorDTO;
import bj.highfiveuniversity.book.mapper.AuthorMapper;
import bj.highfiveuniversity.book.model.Author;
import bj.highfiveuniversity.book.repository.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository auteurRepository;

    public Author addAuthor(Author auteur) {
        return auteurRepository.save(auteur);
    }

    //Affiche tous les auteurs
    public List<AuthorDTO> allAuthor(){

        List<Author> auteurs = auteurRepository.findAll();

        List<AuthorDTO> auteursDTO = new ArrayList<>();
        
        for(Author auteur : auteurs){
            AuthorDTO auteurDTO = AuthorMapper.toDTO(auteur);
            auteursDTO.add(auteurDTO);
        }
        return auteursDTO;
    }

    //Suppression d'un Auteur
    public void deleteAuthor(Long id) {
        auteurRepository.deleteById(id);
    }

    public AuthorDTO author(Long id) {
        Author auteur = auteurRepository.findById(id).get();
        return AuthorMapper.toDTO(auteur);
    }

    //Modification d'un Auteur
    public Author updateAuthor(Long id, Author auteur) {
        return auteurRepository.findById(id).map(el -> {
            el.setNom(auteur.getNom());
            el.setPrenom(auteur.getPrenom());
            el.setNationnality(auteur.getNationnality());
            return auteurRepository.save(el);
        }).orElseThrow(() -> new RuntimeException("pas d'auteur avec cet Id : " + id));
    }

}