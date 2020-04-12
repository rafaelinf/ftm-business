package com.inancial.transaction.business;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inancial.transaction.business.enums.ClientStatusEnum;
import com.inancial.transaction.business.model.Client;
import com.inancial.transaction.business.service.ClientService;

@SpringBootApplication
public class FinancialTransactionBusinessApplication implements CommandLineRunner{

	@Autowired
	private ClientService clientService;
	
	public static void main(String[] args) {
		SpringApplication.run(FinancialTransactionBusinessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
//		Client client = new Client();
//		client.setBalance(new BigDecimal(1000.55));
//		client.setCpf("12345678985");
//		client.setName("João Batista");
//		client.setNumberCard("1234456785201478");
//		client.setPasswordCard("b59c67bf196a4758191e42f76670ceba");
//		client.setScore(BigInteger.ZERO);
//		client.setStatus(ClientStatusEnum.ATIVO);
//		clientService.save(client);
	}

}
