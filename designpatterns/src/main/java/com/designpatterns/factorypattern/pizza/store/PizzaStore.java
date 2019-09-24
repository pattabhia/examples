package com.designpatterns.factorypattern.pizza.store;

import com.designpatterns.factorypattern.pizza.factory.Pizza;

public abstract class PizzaStore {

	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.bake();
	}
	
	protected abstract Pizza createPizza(String type);
}

