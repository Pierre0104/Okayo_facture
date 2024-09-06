package com.facturation.facturation.controller;

import com.facturation.facturation.dto.clientDTO;
import com.facturation.facturation.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class clientController {

    @Autowired
    private clientService clientService;

    @GetMapping
    public List<clientDTO> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping
    public clientDTO createClient(@RequestBody clientDTO clientDTO) {
        return clientService.createClient(clientDTO);
    }

    @GetMapping("/{id}")
    public clientDTO getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
