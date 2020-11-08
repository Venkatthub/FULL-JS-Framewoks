package com.vendingmachine.consumers;

import com.vendingmachine.serviceclasses.Beverage;

public class ServiceConsumer implements Consume {

	private Beverage drink;
	private double totalAmount;
	private int quantity;
	private double amountReceived;

	public ServiceConsumer(Beverage drink) {

		this.drink = drink;

	}

	@Override
	public double getTotalAmount() {

		return totalAmount;

	}

	@Override
	public boolean collectCoins(double amount) {

		this.amountReceived += amount;

		if (totalAmount <= amountReceived) {

			return false;

		}

		return true;

	}

	@Override
	public void printBill() {

		var balance = (amountReceived > totalAmount) ? amountReceived - totalAmount : 0.0;

		System.out.println("---------------------------------------");
		System.out.println("Beverage selected :" + drink.getName());
		System.out.println("Selected quantity :" + quantity);
		System.out.println("Amount to be paid :" + totalAmount);
		System.out.println("Total Amout paid :" + amountReceived);
		System.out.println("Balance :" + balance);
		System.out.println("\n" + "Thanks!! visit again :)");

	}

	@Override
	public void setQuantity(int quantity) {

		totalAmount = quantity * drink.getPrice();
		this.quantity = quantity;

	}

	@Override
	public String toString() {

		return "Drink :" + drink.getName() + " Price :" + drink.getPrice();

	}

}
