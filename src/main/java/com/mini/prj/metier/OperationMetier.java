package com.mini.prj.metier;

import com.mini.prj.entities.Client;
import com.mini.prj.entities.Operation;

import java.util.List;

public interface OperationMetier {

    public Operation saveOperation(Operation c);
    public List<Operation> listOperation();
    public void deleteOperation(Long id);
    public Operation updateOperation(Long id,Double montant);

}