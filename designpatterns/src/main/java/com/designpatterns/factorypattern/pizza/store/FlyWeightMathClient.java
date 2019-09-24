package com.designpatterns.factorypattern.pizza.store;

import flyweight.IMath;
import flyweight.MathFactory;

public class FlyWeightMathClient {

	public static void main(String[] args) {

		MathFactory factory = MathFactory.getInstance();
		IMath add = factory.getMathInstance("add");
		IMath multi = factory.getMathInstance("multi");
		System.out.println(add.doMath(3, 4));
		System.out.println(multi.doMath(4, 5));
		
		String hello ="Sh";
		System.out.println(reverseRecursively(hello));
	}

	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }


}
