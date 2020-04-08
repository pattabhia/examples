package com.abhiram.algo.recursion.fibonacci;

public class FibonacciNextNumber implements Fibonacci {

    // Function to return the next
    // fibonacci number
    static long nextFibonacci(int n)
    {
        double a = n * (1 + Math.sqrt(5)) / 2.0;
        return Math.round(a);
    }

    // Driver code
    public static void main (String[] args)
    {
        int n = 2;
        System.out.printf("The next fib number of %d is %d", n, nextFibonacci(n));
    }
}
