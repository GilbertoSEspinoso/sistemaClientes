package com.devsuperior.sistemaClientes.repositories;

import com.devsuperior.sistemaClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
