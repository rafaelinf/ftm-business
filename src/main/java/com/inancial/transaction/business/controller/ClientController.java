package com.inancial.transaction.business.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inancial.transaction.business.dto.ClientDTO;
import com.inancial.transaction.business.model.Client;
import com.inancial.transaction.business.service.ClientService;
import com.inancial.transaction.business.utils.MapperUtils;

@RestController
@RequestMapping("/clients")
public class ClientController {

	private static final Logger log = LoggerFactory.getLogger(ClientController.class);

	@Autowired
	private ClientService clientService;
	
    @PostMapping("/save")
	public ClientDTO save(@Valid @RequestBody ClientDTO clientDTO) {
    	Client client = this.clientService.save(clientDTO);
		return MapperUtils.convertToDto(client);
	}

    @GetMapping("/{id}")	
	public ClientDTO findClientById(@PathVariable Long id) {   	
    	Client client = this.clientService.findClientById(id);
		return MapperUtils.convertToDto(client);
	}
	
    @GetMapping("/all")	
	public List<ClientDTO> findClientByAll() {
    	List<Client> listClient = this.clientService.findClientByAll();
		return MapperUtils.convertToDto(listClient);
	}	
    
    @GetMapping("/cpf/{cpf}")
	public ClientDTO findClientByCpf(@PathVariable String cpf) {
    	Client client = this.clientService.findClientByCpf(cpf);
		return MapperUtils.convertToDto(client);
    }
    
    @GetMapping("/numberCard/{numberCard}")
	public ClientDTO findByNumberCard(@PathVariable String numberCard) {
    	Client client = this.clientService.findByNumberCard(numberCard);
		return MapperUtils.convertToDto(client);
    }    
	
}
