package com.checkout.model;

public class NormalPotatoes extends Potatoes {
	private static final double pricePerLbOfNormalPotatoes = 2.5;

	public NormalPotatoes(double weight) {
		super(CheckoutItems.NORMALPOTATOES.toString(), weight);
	}
	
	@Override
	public double getCost() {
		return pricePerLbOfNormalPotatoes*getWeight();
	}
}
