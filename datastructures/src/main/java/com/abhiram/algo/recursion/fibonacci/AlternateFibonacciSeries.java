package com.abhiram.algo.recursion.fibonacci;

public class AlternateFibonacciSeries {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; ++i) {
            //if i%2==0, it is even numbers.
            // i%2>0, it is odd number.
            if (i % 2 > 0) {
                System.out.println(new FibonacciSeries().fibonacci(i));
            }
        }
    }
}
