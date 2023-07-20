package com.sub;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="Cheque4")  
@PrimaryKeyJoinColumn(name="Id")   
public class Cheque extends Payment{
	

	@Column(name="ChequeType")
	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	
}
}
	
