package com.inancial.transaction.business.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inancial.transaction.business.dto.ClientDTO;
import com.inancial.transaction.business.model.Client;
import com.inancial.transaction.business.operations.TransactionDTO;
import com.inancial.transaction.business.service.ClientService;
import com.inancial.transaction.business.utils.MapperUtils;

@RestController
@RequestMapping("/balance")
public class BalanceController {
	
	private static final Logger log = LoggerFactory.getLogger(BalanceController.class);

	@Autowired
	private ClientService clientService;
		
    @PostMapping("/debitBalance")
	public ClientDTO debitBalance(@Valid @RequestBody TransactionDTO transactionDTO) {
    	log.info("Debitar valor do saldo: numberCard {}; valor {}", transactionDTO.getNumberCard(), transactionDTO.getValue());

    	Client client = this.clientService.debitBalance(transactionDTO);
		return MapperUtils.convertToDto(client);	
    }	
	
}
