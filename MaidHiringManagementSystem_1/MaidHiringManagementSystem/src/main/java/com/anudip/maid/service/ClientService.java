package com.anudip.maid.service;

import java.util.List;

import com.anudip.maid.entity.Client;

public interface ClientService {
    List<Client> getAllClients();
    Client getClientById(Long id);
    Client saveClient(Client client);
    void deleteClient(Long id);
}
