package com.mini.prj.metier;

import com.mini.prj.entities.Compte;
import com.mini.prj.dao.CompteRepository;
import com.mini.prj.entities.CompteCourant;
import com.mini.prj.entities.CompteEpargne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
import java.util.List;
import java.util.Optional;

@Service
public class CompteMetierImpl implements CompteMetier {

    @Autowired
    private CompteRepository compteRepository;

    @Override
    public Compte saveCompte(Compte c) {
        return compteRepository.save(c);
    }

    @Override
    public List<Compte> listCompte() {
        return compteRepository.findAll();
    }

    @Override
    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }

    @Override
    public Compte updateCompte(String id, Compte c) {
        Optional<Compte> existingCompte = compteRepository.findById(id);
        if (existingCompte.isPresent()) {
            Compte compteToUpdate = existingCompte.get();
            compteToUpdate.setDateCreation(c.getDateCreation());
            compteToUpdate.setSolde(c.getSolde());
            compteToUpdate.setClient(c.getClient());
            compteToUpdate.setEmploye(c.getEmploye());
            return compteRepository.save(compteToUpdate);
        }
        return null;
    }

    @Override
    public Compte getCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }
    public Compte saveCompte(CompteCourant compteCourant) {
        return compteRepository.save(compteCourant);
    }

   // public Compte saveCompte(CompteEpargne compteEpargne) {
     //   return compteRepository.save(compteEpargne);
    //}

}*/


import java.util.List;

@Service
public class CompteMetierImpl implements CompteMetier {

    @Autowired
    private CompteRepository compteRepository;

    @Override
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);   // Save the new account in the database
    }

    @Override
    public List<Compte> listComptes() {
        return compteRepository.findAll();      // Retrieve all accounts from the database
    }
}
