package com.checkout.model;

public class Chocolate extends IceCream {
	private static final double priceOfChocolate= 4.5;
	public Chocolate() {
		super(CheckoutItems.CHOCOLATE.toString());
	}
	@Override
	public double getCost() {
		return priceOfChocolate;
	}

}

