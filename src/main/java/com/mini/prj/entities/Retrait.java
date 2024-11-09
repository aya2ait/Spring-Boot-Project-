package com.mini.prj.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@DiscriminatorValue("R")
public class Retrait extends Operation{
    public Retrait() {}

    public Retrait(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }


    public String effectuerRetrait(Compte compte ,double montantRetrait){
        if(compte.getSolde() >= montantRetrait){
            compte.setSolde(compte.getSolde() - montantRetrait);
            this.setCompte(compte);
            this.setMontant(montantRetrait);
            this.setDateOperation(new Date());


            return "Retrait effectué avec succès. Nouveau solde: " + compte.getSolde();
        }
        else {
            // Retourner un message d'erreur si le solde est insuffisant
            return "Erreur: Solde insuffisant pour effectuer le retrait.";
        }

    }

}

