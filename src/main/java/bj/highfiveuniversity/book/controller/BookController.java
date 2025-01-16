package bj.highfiveuniversity.book.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/books")

public class BookController {
    @GetMapping()
    public String getAllbook(){
        return "Listees de tous les livres";
    }

    @PostMapping()
    public String addbook(){
        return "Listes ajouter avec des succes !!";
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable String id){
        return"Détails du livre avec l'id : " + id;
    }

    @GetMapping("search")
    public String searchBooks(@RequestParam String author, @RequestParam(required = false) String year) {
        return "auteur : " + author + "anne : " + year  ;
    }
    

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id){
        return "Livre avec l'ID " + id + " à été supprimer.";
    }

    
}
