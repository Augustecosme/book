package bj.highfiveuniversity.book.mapper;

import bj.highfiveuniversity.book.DTO.AuthorDTO;
import bj.highfiveuniversity.book.model.Author;

public class AuthorMapper {
    //Convertir un Auteur en AuteurDTO
    public static AuthorDTO toDTO(Author auteur){
        return new AuthorDTO(
            auteur.getId(),
            auteur.getNom(),
            auteur.getPrenom()
        );
    }
}


/**
 * Class Author
 * constructor(id, nom, prenom, nationnality)
 * 
 * Class AuthorDTO
 * constructor(newId, name)
 * 
 * Author john = new Author(1, "Doe", "john", "italian")
 * 
 */