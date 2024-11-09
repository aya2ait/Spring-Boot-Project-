package com.mini.prj.services;


import com.mini.prj.entities.Client;
import com.mini.prj.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRestService {


    //crud create ,read ,update ,delete
    @Autowired
    private ClientMetier clientMetier;


    @RequestMapping(value="/clients",method= RequestMethod.POST)
    public Client saveClient(@RequestBody Client c) {
        return clientMetier.saveClient(c);
    }


    @RequestMapping(value="/clients",method=RequestMethod.GET)
    public List<Client> listClient() {
        return clientMetier.listClient();
    }

    @RequestMapping(value="/clients/{id}",method=RequestMethod.DELETE)
    public void deleteClient(@PathVariable("id")Long id) {
        clientMetier.deleteClient(id);
    }

    // New update method
    @RequestMapping(value = "/clients/{id}", method = RequestMethod.PUT)
    public Client updateClient(@PathVariable("id") Long id, @RequestParam("nomClient") String nomClient) {
        return clientMetier.updateClient(id, nomClient);
    }

}
