package bj.highfiveuniversity.book.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livres")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    private String isbn;

    private LocalDate published_at;
    
    @ManyToMany
    @JoinTable(
        name = "auteur_livre",
        joinColumns = @JoinColumn(name = "Livres_id"),
        inverseJoinColumns = @JoinColumn(name = "auteur_id")
    )
    private Set<Author> auteurs;

    public Set<Author> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(Set<Author> auteurs) {
        this.auteurs = auteurs;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Editeurs getEditeurs() {
        return editeurs;
    }

    public void setEditeurs(Editeurs editeurs) {
        this.editeurs = editeurs;
    }

    public Etagere getEtageres() {
        return etageres;
    }

    public void setEtageres(Etagere etageres) {
        this.etageres = etageres;
    }

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categories categories;

    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne
    @JoinColumn(name = "editeur_id")
    private Editeurs editeurs;

    @ManyToOne
    @JoinColumn(name = "etagere_id")
    private Etagere etageres;

    //Getter et  Setter
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



}
