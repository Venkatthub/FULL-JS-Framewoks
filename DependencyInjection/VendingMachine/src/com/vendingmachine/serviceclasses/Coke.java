package com.vendingmachine.serviceclasses;

public class Coke implements Beverage {

	private static String NAME = "COKE";
	private static double PRICE = 35.5;

	@Override
	public String getName() {

		return NAME;
	}

	@Override
	public double getPrice() {

		return PRICE;

	}

}
