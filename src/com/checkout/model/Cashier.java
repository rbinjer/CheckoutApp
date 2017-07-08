package com.checkout.model;


public class Cashier {

	public static void main(String[] args) {
		CheckoutCashier cc = new CheckoutCashier();
		int choice; 
		
		while(true){
			cc.displayItems();
			choice = cc.getChoice();
			if (choice==-1){
				break; 
			}
			else {
				cc.addItem();
				cc.displayReceipt();
				cc.proceedToCheckout();
				
			}
		}
		
		cc.displayReceipt();

	}

}
