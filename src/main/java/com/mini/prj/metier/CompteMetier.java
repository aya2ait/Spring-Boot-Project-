package com.mini.prj.metier;


import com.mini.prj.entities.Compte;


import java.util.List;



/*public interface CompteMetier {
    Compte saveCompte(Compte c);
    List<Compte> listCompte();
    void deleteCompte(String id);
    Compte updateCompte(String id, Compte c);
    Compte getCompteById(String id);
}*/
public interface CompteMetier {
    Compte addCompte(Compte compte);   // Method to add a new account
    List<Compte> listComptes();        // Method to list all accounts
   //public Compte saveCompte(Compte c);
}
