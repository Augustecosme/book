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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bj.highfiveuniversity.book.DTO.BookDTO;
import bj.highfiveuniversity.book.model.Book;
import bj.highfiveuniversity.book.service.BookService;


@RestController
@RequestMapping("/books")

public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book livre){
        return bookService.addBook(livre);
    }

    @GetMapping("/allBook")
    public List<BookDTO> allBook(Book livre){
        return bookService.allBook(); 
    }
    
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book livre){
        return bookService.updateBook(id, livre);
    }

    @GetMapping("/{id}")
    public BookDTO book(@PathVariable Long id) {
        return bookService.book(id);
    }

    @GetMapping("search")
    public String searchBooks(@RequestParam String author, @RequestParam(required = false) String year) {
        return "auteur : " + author + "anne : " + year  ;
    }

    

    
}
