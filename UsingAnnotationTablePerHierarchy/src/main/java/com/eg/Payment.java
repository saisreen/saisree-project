package com.eg;

import javax.persistence.*;

@Entity 
@Table(name = "payment3")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="payment")  
public class Payment {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="id")
			private int id;
	
	@Column(name="amount")
			private int amount;
			
			public int id() {
				return id;
			}
			public void setid(int id) {
				this.id = id;
			}
			public int getAmount() {
				return amount;
			}
			public void setAmount(int amount) {
				this.amount = amount;
			}
			


}
