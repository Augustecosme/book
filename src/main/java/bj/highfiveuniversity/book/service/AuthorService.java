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
}