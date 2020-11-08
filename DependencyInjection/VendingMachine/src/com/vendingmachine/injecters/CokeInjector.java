package com.vendingmachine.injecters;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.serviceclasses.Coke;

public class CokeInjector implements BeverageInjecter {

	@Override
	public ServiceConsumer getConsumer() {
		return new ServiceConsumer(new Coke());
	}

}
