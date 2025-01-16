package bj.highfiveuniversity.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Pour dire que c'est un controller
@RequestMapping("/") //Pour dire que ce controller revois cette requete avec la route /
public class BiblioController {
    @GetMapping("")
    public String welcome(){
        return "Bienvenue sur notre Application de gestion de bibliothéque 🎇✨🚀";
    }
}
