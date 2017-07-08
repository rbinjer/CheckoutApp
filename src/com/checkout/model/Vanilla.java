package com.checkout.model;

public class Vanilla extends IceCream {
	private static final double priceOfVanilla= 3.5;
	public Vanilla() {
		super(CheckoutItems.VANILLA.toString());
	}
	@Override
	public double getCost() {
		return priceOfVanilla;
	}

}
