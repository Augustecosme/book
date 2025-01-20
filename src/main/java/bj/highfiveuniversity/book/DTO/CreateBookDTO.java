package bj.highfiveuniversity.book.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CreateBookDTO {
    

    private Long id;

    // @NotNull(message = "le titre ne peut être nul.")
    @NotBlank(message="le titre du livre ne peut être vide ou blanc")
    @Size(min=1, max=100, message= "le titre doit être compris entre 1 et 100 caractères")
    private String title;

    @Pattern(regexp = "^[0-9]{13}$" , message = "L'ISDN doit comporter exactement 13 chiffres.")
    private String isbn;

    @NotBlank(message = "la date de publication  du livre ne peut pas être vide ou null.")
    private LocalDate published_at;


    // private Set<AuthorDTO> auteurs;

    
    //Constructeur
    public CreateBookDTO(Long id, String title, String isbn, LocalDate published_at){
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.published_at = published_at;
        // this.auteurs = auteurs; 
    }
    
    public Long getId() {
        return id;
    }
    
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public LocalDate getPublished_at() {
        return published_at;
    }

    public void setPublished_at(LocalDate published_at) {
        this.published_at = published_at;
    }
    // public Set<AuthorDTO> getAuteurs() {
    //     return auteurs;
    // }

    // public void setAuteurs(Set<AuthorDTO> auteurs) {
    //     this.auteurs = auteurs;
    // }
}
