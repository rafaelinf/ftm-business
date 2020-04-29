package com.inancial.transaction.business.dto;

import java.io.Serializable;

public class AuthenticateDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String numberCard;
	private String password;

	public AuthenticateDTO() {
		// TODO Auto-generated constructor stub
	}

	public AuthenticateDTO(String numberCard, String password) {
		this.numberCard = numberCard;
		this.password = password;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
