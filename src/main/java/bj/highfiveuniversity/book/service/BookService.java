package bj.highfiveuniversity.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bj.highfiveuniversity.book.model.Book;
import bj.highfiveuniversity.book.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository livreRepository;

    public Book addBook(Book livre){
        return livreRepository.save(livre);
    }

    public List<Book> allBook(Book livre){
        return livreRepository.findAll();
    }

    public void deleteBook(Long id){
        livreRepository.deleteById(id);
    }
    
    public Book updateBook(Long id, Book livre){
        return livreRepository.findById(id).map(el ->{
            el.setIsbn(livre.getIsbn());
            el.setTitle(livre.getTitle());
            el.setPublished_at(livre.getPublished_at());
            return livreRepository.save(el);
        }).orElseThrow(()->new RuntimeException("pas d'auteur avec cet Id : " + id));
    }
}
