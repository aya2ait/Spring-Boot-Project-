package com.mini.prj.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table

@DiscriminatorValue("V")
public class Versement extends Operation {

    public Versement() {}

    public Versement(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }


    // Fonction pour effectuer un versement sur un compte
    public String effectuerVersement(Compte compte, double montantVersement) {
        if (montantVersement > 0) {
            // Mise à jour du solde du compte après le versement
            compte.setSolde(compte.getSolde() + montantVersement);

            // Ajouter cette opération de versement à l'historique des opérations du compte
            this.setCompte(compte);
            this.setMontant(montantVersement);
            this.setDateOperation(new Date()); // Fixe la date à l'heure actuelle

            // Retourner un message de succès
            return "Versement effectué avec succès. Nouveau solde: " + compte.getSolde();
        } else {
            // Retourner un message d'erreur si le montant du versement est invalide
            return "Erreur: Le montant du versement doit être positif.";
        }
    }
}
