package bj.highfiveuniversity.book.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "etageres")
public class Etagere {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;

//    @Column(nullable = false)
    private String numero;

    private String emplacement;

    @OneToMany(mappedBy= "etageres")
    private Set<Book> livres;
    
    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }
}