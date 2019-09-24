package com.designpatterns.factorypattern.pizza.store;

import com.designpatterns.factorypattern.pizza.factory.GACheesePizza;
import com.designpatterns.factorypattern.pizza.factory.Pizza;

public class GAPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("Cheese".equals(type)) {
			pizza = new GACheesePizza();
		}
		return pizza;
	}

}
