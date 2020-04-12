package com.abhiram.algo.recursion.fibonacci;

public class FibonacciSeries extends Fibonacci {

    public static void main(String[] args) {
        for(int i=0;i<=10;++i) {
            System.out.println(new FibonacciSeries().fibonacci(i));
        }
    }
}
