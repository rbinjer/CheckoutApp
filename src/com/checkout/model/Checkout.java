package com.checkout.model;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
	List<RetailItem> items; 
	
	public Checkout(){
		this.items = new ArrayList<>();
	}
	
	public void addItem(RetailItem item){
		items.add(item);
	}
	
	public RetailItem removeLastItem(){
		return items.remove(items.size()-1);
	}
	
	public void displayItems(){
		double total = 0;
		for (RetailItem r : items){
			System.out.println("Item: "+r.getName() +"          "+"Price: "+r.getCost());
			total+=r.getCost();
		}
		System.out.println("Total: "+total);
	}
	
}
