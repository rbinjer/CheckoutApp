package com.checkout.model;

public abstract class Eggs extends RetailItem {
	private int numberOfEggs;

	public Eggs(String name, int numberOfEggs ) {
		super(name);
		this.setNumberOfEggs(numberOfEggs);
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}
}
