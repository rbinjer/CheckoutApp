package com.checkout.model;

public class Strawberry extends IceCream {
	private static final double priceOfStrawberry = 4;
	public Strawberry() {
		super(CheckoutItems.STRAWBERRY.toString());
	}
	@Override
	public double getCost() {
		return priceOfStrawberry ;
	}

}
