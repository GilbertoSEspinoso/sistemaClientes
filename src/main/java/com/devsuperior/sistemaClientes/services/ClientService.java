package com.devsuperior.sistemaClientes.services;

import com.devsuperior.sistemaClientes.dto.ClientDTO;
import com.devsuperior.sistemaClientes.entities.Client;
import com.devsuperior.sistemaClientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
