package com.checkout.model;

public class BrownEggs extends Eggs {
	private static final double pricePerDozBrownEgg = 1;

	public BrownEggs(int numberOfEggs) {
		super(CheckoutItems.BROWNEGGS.toString(), numberOfEggs);
	}

	@Override
	public double getCost() {
		return pricePerDozBrownEgg*getNumberOfEggs()/12;
	}

}
