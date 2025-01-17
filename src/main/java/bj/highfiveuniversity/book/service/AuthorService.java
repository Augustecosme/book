package bj.highfiveuniversity.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import bj.highfiveuniversity.book.model.Author;
import bj.highfiveuniversity.book.repository.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository auteurRepository;

    public Author addAuthor(Author auteur){
        return auteurRepository.save(auteur);
    }

    public List<Author> allAuthor(Author auteur){
        return auteurRepository.findAll();
    }

    public void deleteAuthor(Long id){
        auteurRepository.deleteById(id);
    }

    public Author updateAuthor(Long id, Author auteur){
        return auteurRepository.findById( id).map(el -> {
            el.setNom(auteur.getNom());
            el.setPrenom(auteur.getPrenom());
            el.setNationnality(auteur.getNationnality());
            return auteurRepository.save(el);
        }).orElseThrow(()->new RuntimeExcepion("pas d'auteur avec cet Id : " + id))
    }
}