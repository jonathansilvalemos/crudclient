package com.jsl.crud.controllers;

import com.jsl.crud.dto.ClientDTO;
import com.jsl.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto){
        return service.insert(dto);
    }
}
