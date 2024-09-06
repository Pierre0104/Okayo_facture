package com.facturation.facturation.service;

import com.facturation.facturation.dto.clientDTO;
import com.facturation.facturation.entity.client;
import com.facturation.facturation.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class clientService {

    @Autowired
    private clientRepository clientRepository;

    public List<clientDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public clientDTO createClient(clientDTO clientDTO) {
        client client = convertToEntity(clientDTO);
        client = clientRepository.save(client);
        return convertToDTO(client);
    }

    // méthode pour récupérer un client par ID
    public clientDTO getClientById(Long id) {
        Optional<client> client = clientRepository.findById(id);
        return client.map(this::convertToDTO).orElse(null);
    }

    // méthode pour supprimer un client par ID
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    // Convertir une entité Client en DTO
    private clientDTO convertToDTO(client client) {
        clientDTO dto = new clientDTO();
        dto.setId(client.getId());
        dto.setCode_client(client.getCode_client());
        dto.setNom(client.getNom());
        dto.setAdresse(client.getAdresse());
        dto.setContact(client.getContact());
        return dto;
    }

    // Convertir un DTO Client en entité
    private client convertToEntity(clientDTO clientDTO) {
        client client = new client();
        client.setCode_client(clientDTO.getCode_client());
        client.setNom(clientDTO.getNom());
        client.setAdresse(clientDTO.getAdresse());
        client.setContact(clientDTO.getContact());
        return client;
    }
}
