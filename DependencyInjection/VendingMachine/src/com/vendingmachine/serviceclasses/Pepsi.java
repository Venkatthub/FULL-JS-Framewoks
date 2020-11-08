package com.vendingmachine.serviceclasses;

public class Pepsi implements Beverage {

	private static String NAME = "PEPSI";
	private static double PRICE = 27.5;

	@Override
	public String getName() {

		return NAME;

	}

	@Override
	public double getPrice() {

		return PRICE;

	}

}
