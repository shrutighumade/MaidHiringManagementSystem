package com.anudip.maid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.maid.entity.Client;
import com.anudip.maid.repository.ClientRepository;
import com.anudip.maid.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	ClientRepository clientRepository;
	
    @Autowired
	public ClientServiceImpl(ClientRepository clientRepository) {
		
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id).orElse(null);
	}

	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
		
	}

	
}
