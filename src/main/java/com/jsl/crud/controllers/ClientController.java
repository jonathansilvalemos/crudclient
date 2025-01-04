package com.jsl.crud.controllers;

import com.jsl.crud.dto.ClientDTO;
import com.jsl.crud.entities.Client;
import com.jsl.crud.repositories.ClientRepository;
import com.jsl.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}
