package com.abhiram.algo.recursion.fibonacci;

public class FibonacciNextNumber extends Fibonacci {

    // Driver code
    public static void main(String[] args) {
        int n = 6;
        if (!isFibonacci(n)) {
            System.err.println("You have entered non-fibonacci number to fetch next the fib number!");
            return;
        }
        System.out.printf("The next fib number of %d is %d", n, nextFibonacci(n));
    }
}
