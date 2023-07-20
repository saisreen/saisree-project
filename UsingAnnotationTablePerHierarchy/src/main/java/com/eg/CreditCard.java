package com.eg;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("CreditCard3")  
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