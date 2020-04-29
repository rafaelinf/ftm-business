package com.inancial.transaction.business.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScoreDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cpf;
	private BigDecimal value;
	private int score;

	public ScoreDTO() {
		// TODO Auto-generated constructor stub
	}

	public ScoreDTO(BigDecimal value, int score) {
		this.value = value;
		this.score = score;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
