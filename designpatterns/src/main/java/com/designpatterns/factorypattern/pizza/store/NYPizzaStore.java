package com.designpatterns.factorypattern.pizza.store;

import com.designpatterns.factorypattern.pizza.factory.NYCheesePizza;
import com.designpatterns.factorypattern.pizza.factory.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("Cheese".equals(type)) {
			pizza = new NYCheesePizza();
		}
		return pizza;
	}

}
