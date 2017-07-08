package com.checkout.model;

import java.util.Scanner;


public class CheckoutCashier {
	private Scanner sc ; 
	private Checkout ck;
	private int choice; 
	
	
	CheckoutCashier(){
		sc = new Scanner(System.in);
		ck = new Checkout();
	}
	
	
	public void displayItems(){
		System.out.println("1) Potatoes");
		System.out.println("2) Eggs");
		System.out.println("3) Icecream");
		System.out.println("Enter choice:(-1 to exit)");
	}
	
	public int getChoice(){
		this.choice=sc.nextInt();	
		return this.choice;
	}
	
	private RetailItem getItem() {
		if(choice == 1 ){
			System.out.println("1. Sweet Potatoes.");
			System.out.println("2. Normal Potatoes.");
			System.out.println("Enter the type of Potato:");
			choice = sc.nextInt();
			System.out.println("Enter the weight: ");
			int weight = sc.nextInt();
			
			if (choice == 1 ) return new SweetPotatoes(weight);
			else return new NormalPotatoes(weight);
		}
		else if (choice == 2 ){
			System.out.println("1. White Eggs.");
			System.out.println("2. Brown Eggs.");
			System.out.println("Enter the type of Egg:");
			choice = sc.nextInt();
			System.out.println("Enter the number of Eggs: ");
			int numberOfEggs = sc.nextInt();
			if(choice==1) return new WhiteEggs(numberOfEggs);
			else if(choice==2) return new BrownEggs(numberOfEggs);
		}
		else{
			System.out.println("1. Vanilla");
			System.out.println("2. Strawberry");
			System.out.println("3. Chocolate");
			System.out.println("Enter the type of Icecream:");
			choice =sc.nextInt();
			if(choice==1) return new Vanilla();
			else if(choice==2) return new Strawberry();
			else return new Chocolate();
		}
		
		return null;
	}
	
	public void addItem()  {
		RetailItem item = getItem();
		ck.addItem(item);
	}
	
	public void displayReceipt(){
		ck.displayItems();
	}
	
	private void removeItem(){
		ck.removeLastItem();
	}
	
	public void proceedToCheckout(){
		System.out.println("Do you wish to proceed?(Yes/No)");
		String s =sc.next();
		if (s.equalsIgnoreCase("no")) {
			removeItem();
		ck.displayItems();
		}else 
			System.out.println("Item was added.");
	} 
}
