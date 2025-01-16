package bj.highfiveuniversity.book.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "editeurs")
public class Editeurs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    private Long id;

    private String nom;

    private String email;

    private String adresse;

    @OneToMany(mappedBy = "editeurs")
    private Set<Book> livres;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
