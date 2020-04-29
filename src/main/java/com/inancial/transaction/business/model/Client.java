package com.inancial.transaction.business.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.inancial.transaction.business.enums.ClientStatusEnum;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name")
	private String name;
	
    @Column(name = "cpf")
	private String cpf;
	
    @Column(name = "number_card")
	private String numberCard;
	
    @Column(name = "password_card")
	private String passwordCard;
	
    @Column(name = "balance", precision=10, scale=2) 
	private BigDecimal balance;
	
    @Column(name = "status")
	@Enumerated(EnumType.STRING)
	private ClientStatusEnum status;
	
    @Column(name = "score")
	private Integer score;
	
	@Version
	@Column(name = "version")
	private Integer version;
	
	public Client() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getPasswordCard() {
		return passwordCard;
	}

	public void setPasswordCard(String passwordCard) {
		this.passwordCard = passwordCard;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public ClientStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ClientStatusEnum status) {
		this.status = status;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
