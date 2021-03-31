package com.rit.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class CurrencyExchange {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal convsersionMultiple;
	private String environment;
	
	public CurrencyExchange(Long id, String from, String to, BigDecimal convsersionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convsersionMultiple = convsersionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConvsersionMultiple() {
		return convsersionMultiple;
	}

	public void setConvsersionMultiple(BigDecimal convsersionMultiple) {
		this.convsersionMultiple = convsersionMultiple;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
