package com.mini.prj.services;

import com.mini.prj.entities.Compte;
import com.mini.prj.entities.CompteCourant;
import com.mini.prj.entities.CompteEpargne;
import com.mini.prj.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comptes")
public class CompteRestService {

    @Autowired
    private CompteMetier compteMetier;

   /* @PostMapping
    public Compte saveCompte(@RequestBody Compte c) {
        return compteMetier.saveCompte(c);
    }

    @GetMapping
    public List<Compte> listCompte() {
        return compteMetier.listCompte();
    }

    @GetMapping("/{id}")
    public Compte getCompteById(@PathVariable String id) {
        return compteMetier.getCompteById(id);
    }

    @PutMapping("/{id}")
    public Compte updateCompte(@PathVariable String id, @RequestBody Compte c) {
        return compteMetier.updateCompte(id, c);
    }

    @DeleteMapping("/{id}")
    public void deleteCompte(@PathVariable String id) {
        compteMetier.deleteCompte(id);
    }
   // @PostMapping("/{type}")
    public Compte saveCompte(@PathVariable String type, @RequestBody Compte c) {
        if ("CC".equals(type)) {
            CompteCourant compteCourant = (CompteCourant) c;  // Assurez-vous que la classe CompteCourant est correctement envoyée
            return compteMetier.saveCompte(compteCourant);  // Méthode adaptée dans votre service
        } else if ("CE".equals(type)) {
            CompteEpargne compteEpargne = (CompteEpargne) c;  // Pareil pour CompteEpargne
            return compteMetier.saveCompte(compteEpargne);
        } else {
            throw new IllegalArgumentException("Type de compte non reconnu");
        }
    }*/
   // Endpoint to add a new account
   @PostMapping("/add")
   public Compte addCompte(@RequestBody Compte compte) {
       return compteMetier.addCompte(compte);
   }

    // Endpoint to list all accounts
    @GetMapping("/list")
    public List<Compte> listComptes() {
        return compteMetier.listComptes();
    }



}
