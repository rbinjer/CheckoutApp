package com.checkout.model;

public abstract class RetailItem {
	
	private String name; 
	
	public RetailItem(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract double getCost();
}
