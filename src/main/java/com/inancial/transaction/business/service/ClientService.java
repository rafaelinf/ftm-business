package com.inancial.transaction.business.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.inancial.transaction.business.dto.ClientDTO;
import com.inancial.transaction.business.dto.ScoreDTO;
import com.inancial.transaction.business.enums.ClientStatusEnum;
import com.inancial.transaction.business.model.Client;
import com.inancial.transaction.business.operations.TransactionDTO;
import com.inancial.transaction.business.repository.ClientRepository;
import com.inancial.transaction.business.utils.FtmUtils;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Client save(ClientDTO clientDTO) {
		
		if(clientDTO != null) {
			Client client = new Client();
			client.setBalance(new BigDecimal(1000.55));
			client.setCpf(clientDTO.getCpf());
			client.setName(clientDTO.getName());
			client.setNumberCard(clientDTO.getNumberCard());
			client.setPasswordCard(FtmUtils.md5(clientDTO.getPasswordCard()));
			client.setScore(0);
			client.setStatus(ClientStatusEnum.ATIVO);
			return clientRepository.save(client);			
		}
		
		return null;
	}
	
	public Client update(Client client) {
		return clientRepository.save(client);
	}	
	
	public Client findClientById(Long id) {
		
		Optional<Client> client = clientRepository.findById(id);
		if(client.isPresent()) {
			return client.get();
		}
		
		return null;
	}
	
	public List<Client> findClientByAll() {
		return clientRepository.findAll();
	}
	
	public Client findClientByCpf(String cpf) {
		return clientRepository.findClientByCpf(cpf);
	}
	
	public Client findByNumberCard(String numberCard) {
		return clientRepository.findByNumberCard(numberCard);
	}	
	
	public Client authenticate(String numberCard, String passwordCard) {
		return clientRepository.authenticate(numberCard, passwordCard);
	}
	
	public Client debitBalance(TransactionDTO transactionDTO) {		
		Client client = this.findByNumberCard(transactionDTO.getNumberCard());
		client.setBalance(client.getBalance().subtract(transactionDTO.getValue()));
		clientRepository.save(client);
		return client;		
	}
	
	public ScoreDTO updateScore(ScoreDTO scoreDTO) {
		Client client = this.findClientByCpf(scoreDTO.getCpf());
		if(client != null) {
			client.setScore(client.getScore() + scoreDTO.getScore());
		}
		clientRepository.save(client);
		return scoreDTO;
	}

	
}
