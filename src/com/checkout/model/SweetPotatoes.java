package com.checkout.model;

public class SweetPotatoes extends Potatoes {
	private static final double pricePerLbOfSweetPotatoes = 1.5;

	public SweetPotatoes(double weight) {
		super(CheckoutItems.SWEETPOTATOES.toString(), weight);
	}
	@Override
	public double getCost() {
		return pricePerLbOfSweetPotatoes*getWeight();
	}
}
