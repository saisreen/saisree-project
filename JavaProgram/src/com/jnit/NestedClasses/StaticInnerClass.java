package com.jnit.NestedClasses;

class shoppingmall {
	
	void Advertisement  () {
		System.out.println(" Displayed an offer in advertisement");
	}

	//static inner class
static class Stores {
	
	void DressShop () {                    //Instance Method
		System.out.println(" There is 25% discount at Holister store");
	}
	
	static void walletShop () {            //Static Method 
		System.out.println(" There is 10% discount at Michael Kors ");
	}
}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object created for outer class 
		shoppingmall garden = new shoppingmall();
		garden.Advertisement();
		
     	//object created for inner class of instance method
		shoppingmall.Stores holister = new shoppingmall.Stores();
		holister.DressShop();
		
		//static excecution depends on classname
		shoppingmall.Stores.walletShop();
	}

}
