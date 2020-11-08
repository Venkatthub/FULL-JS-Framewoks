package com.vendingmachine.injecters;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.serviceclasses.Pepsi;

public class PepsiInjector implements BeverageInjecter {

	@Override
	public ServiceConsumer getConsumer() {

		return new ServiceConsumer(new Pepsi());

	}

}
