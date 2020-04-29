package com.inancial.transaction.business.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inancial.transaction.business.dto.ScoreDTO;
import com.inancial.transaction.business.service.ClientService;

@RestController
@RequestMapping("/score")
public class ScoreController {

	private static final Logger log = LoggerFactory.getLogger(ScoreController.class);

	@Autowired
	private ClientService clientService;
		
    @PostMapping("/updateScore")
	public ScoreDTO updateScore(@Valid @RequestBody ScoreDTO scoreDTO) {
    	log.info("Atualizar pontuação {}", scoreDTO.getScore());
    	return this.clientService.updateScore(scoreDTO);	
    }	
		
}
