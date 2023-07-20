package com.eg;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("Cheque3")  
public class Cheque extends Payment {
	
	@Column(name="ChequeType")
	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	} 
	
	

}

