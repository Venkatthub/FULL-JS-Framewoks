package com.vendingmachine.injecters;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.serviceclasses.Soda;

public class SodaInjector implements BeverageInjecter {

	@Override
	public ServiceConsumer getConsumer() {

		return new ServiceConsumer(new Soda());

	}

}
