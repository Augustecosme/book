package bj.highfiveuniversity.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.highfiveuniversity.book.model.Book;

public interface BookRepository  extends JpaRepository<Book, Long> {
    
}
