package com.co;




import javax.persistence.*;

@Entity  
@Table(name="Cheque5")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="amount", column=@Column(name="amount"))  
})  
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


