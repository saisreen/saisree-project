package com.co;


import javax.persistence.*;

@Entity  
@Table(name="CreditCard5")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="amount", column=@Column(name="amount"))  
})   
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