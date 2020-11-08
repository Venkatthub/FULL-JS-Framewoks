package com.vendingmachine.consumers;

public interface Consume {

	double getTotalAmount();

	boolean collectCoins(double amount);

	void printBill();

	void setQuantity(int quantity);

}
