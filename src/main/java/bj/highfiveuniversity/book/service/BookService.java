package bj.highfiveuniversity.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bj.highfiveuniversity.book.DTO.BookDTO;
import bj.highfiveuniversity.book.mapper.BookMapper;
import bj.highfiveuniversity.book.model.Book;
import bj.highfiveuniversity.book.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository livreRepository;

    public Book addBook(Book livre){
        return livreRepository.save(livre);
    }

    public List<BookDTO> allBook(){
        List<Book> livres = livreRepository.findAll();

        List<BookDTO> livresDTO = new ArrayList<>();
        
        for(Book livre : livres){
            BookDTO livreDTO = BookMapper.toDTO(livre);
            livresDTO.add(livreDTO);
        }
        return livresDTO;
    }

    public void deleteBook(Long id){
        livreRepository.deleteById(id);
    }
    
 public BookDTO book(Long id){
        Book livre = livreRepository.findById(id).get();
        return BookMapper.toDTO(livre);
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
