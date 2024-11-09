package com.mini.prj.metier;

import com.mini.prj.dao.OperationRepository;
import com.mini.prj.entities.Client;
import com.mini.prj.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OperationMetierImpl implements OperationMetier {

    @Autowired
    private OperationRepository operationRepository;

    @Override
    public Operation saveOperation(Operation c) {
        // TODO Auto-generated method stub
        return operationRepository.save(c);
    }

    @Override
    public List<Operation> listOperation() {
        // TODO Auto-generated method stub
        return operationRepository.findAll();
    }

    @Override
    public void deleteOperation(Long id) {
        operationRepository.deleteById(id);
    }
    //montant

    @Override
    public Operation updateOperation(Long id, Double montant) {
        Optional<Operation> existingOperation = operationRepository.findById(id);
        if(existingOperation .isPresent()) {
            Operation operation = existingOperation.get();
            operation.setMontant(montant);
            return operationRepository.save(operation);
        }else{
            throw new RuntimeException("Operation with ID " + id + " not found");
        }
    }
}