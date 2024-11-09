package com.mini.prj.metier;

import com.mini.prj.entities.Client;
import com.mini.prj.entities.Compte;
import com.mini.prj.entities.Operation;
import com.mini.prj.entities.Retrait;

import java.util.List;

public interface OperationMetier {

    public Operation saveOperation(Operation c);
    public List<Operation> listOperation();
    public void deleteOperation(Long id);
    public Operation updateOperation(Long id,Double montant);

    //fonction de Retrait
    public String effeffectuerRetrait(String codeCompte, Double montant);
    public String effeffectuerVersement(String codeCompte, Double montant);

}