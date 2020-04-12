package com.inancial.transaction.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inancial.transaction.business.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	@Query("SELECT c FROM Client c WHERE c.cpf = :cpf")
	Client findClientByCpf(@Param("cpf") String cpf);	
	
	@Query("SELECT c FROM Client c WHERE c.numberCard = :numberCard")
	Client findByNumberCard(@Param("numberCard") String numberCard);	
	
}
