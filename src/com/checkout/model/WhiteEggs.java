package com.checkout.model;

public class WhiteEggs extends Eggs {
	private static final double pricePerDozWhiteEgg = .5;

	public WhiteEggs(int numberOfEggs) {
		super(CheckoutItems.WHITEEGS.toString(), numberOfEggs);
	}
	@Override
	public double getCost() {
		return pricePerDozWhiteEgg*getNumberOfEggs()/12;
	}
}
