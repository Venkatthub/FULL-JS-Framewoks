package com.vendingmachine.consumers;

public interface Consume {

	void setQuantity(int quantity);

	double getTotalAmount();

	boolean collectCoins(double amount);

	void printBill();

}
