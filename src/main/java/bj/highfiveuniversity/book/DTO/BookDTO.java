package bj.highfiveuniversity.book.DTO;

// import java.util.Set;

public class BookDTO {
     private Long id;

    private String title;

    private String isbn;


    // private Set<AuthorDTO> auteurs;

    //Constructeur
    public BookDTO(Long id, String title, String isbn){
        this.id = id;
        this.title = title;
        this.isbn = isbn;
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

    // public Set<AuthorDTO> getAuteurs() {
    //     return auteurs;
    // }

    // public void setAuteurs(Set<AuthorDTO> auteurs) {
    //     this.auteurs = auteurs;
    // }
}
