package com.designpatterns.factory;

import com.designpatterns.factorypattern.pizza.store.GAPizzaStore;
import com.designpatterns.factorypattern.pizza.store.PizzaStore;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaStore store = new GAPizzaStore();
		store.orderPizza("Cheese");
	}
}
