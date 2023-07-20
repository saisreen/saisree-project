package com.sub;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="CreditCard4")  
@PrimaryKeyJoinColumn(name="Id")  
public class CreditCard extends Payment{

	@Column(name="creditcardtype")
	private String creditCardType;

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	
	
}
