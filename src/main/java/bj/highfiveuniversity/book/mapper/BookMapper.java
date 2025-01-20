package bj.highfiveuniversity.book.mapper;

import bj.highfiveuniversity.book.DTO.BookDTO;
import bj.highfiveuniversity.book.model.Book;


public class BookMapper {
    //Convertir un Auteur en AuteurDTO
    public static BookDTO toDTO(Book livre){
        return new BookDTO(
            livre.getId(),
            livre.getIsbn(),
            livre.getTitle()
        );
    }
}
