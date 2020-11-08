package com.vendingmachine;

import java.util.Scanner;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.injecters.BeverageInjecter;
import com.vendingmachine.injecters.CokeInjector;
import com.vendingmachine.injecters.PepsiInjector;
import com.vendingmachine.injecters.SodaInjector;

public class FrontClass {

	static Scanner scan = new Scanner(System.in);

	static BeverageInjecter inject = null;

	public static void main(String[] args) {

		vendingMachine();

	}

	public static void vendingMachine() {

		ServiceConsumer vendingService;

		try {

			vendingService = inject.getConsumer();

			System.out.println("You selected " + "\n" + vendingService);

			System.out.println("Please select quantity :");

			vendingService.setQuantity(scan.nextInt());

			System.out.println(
					"Total amount to be paid :" + vendingService.getTotalAmount() + "\n" + "Please insert coins ");

			while (vendingService.collectCoins(scan.nextDouble())) {

				System.out.println("Coin added");

			}

			System.out.println("Please collect your Drink and Bill" + "\n");

			vendingService.printBill();

		} catch (Exception e) {

			selectDrink();

		}

	}

	public static void selectDrink() {

		System.out.println("Enter your choice :" + "\n" + "1. COKE" + "\n" + "2. PEPSI" + "\n" + "3. SODA");

		var choice = scan.nextInt();

		if (choice == 1) {

			inject = new CokeInjector();

		} else if (choice == 2) {

			inject = new PepsiInjector();

		} else if (choice == 3) {

			inject = new SodaInjector();

		} else {

			System.out.println("Invalid Choice !");
		}

		vendingMachine();

	}

}
