package bj.highfiveuniversity.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj.highfiveuniversity.book.DTO.AuthorDTO;
import bj.highfiveuniversity.book.model.Author;
import bj.highfiveuniversity.book.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author auteur) {
        return authorService.addAuthor(auteur);
    }

    @GetMapping("/allAuthor")
    public List<AuthorDTO> allAuthor(Author auteur) {
        return authorService.allAuthor();
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }

    @PutMapping("/update/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author auteur) {
        return authorService.updateAuthor(id, auteur);
    }

    @GetMapping("/{id}")
    public AuthorDTO author(@PathVariable Long id) {
        return authorService.author(id);
    }

}