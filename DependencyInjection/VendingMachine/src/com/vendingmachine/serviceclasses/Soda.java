package com.vendingmachine.serviceclasses;

public class Soda implements Beverage {

	private static String NAME = "SODA";
	private static double PRICE = 15.50;

	@Override
	public String getName() {

		return NAME;

	}

	@Override
	public double getPrice() {

		return PRICE;

	}

}
