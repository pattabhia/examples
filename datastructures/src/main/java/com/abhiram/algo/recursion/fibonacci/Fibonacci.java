package com.abhiram.algo.recursion.fibonacci;

public abstract class Fibonacci {

    public int fibonacci(int num) {
        if (num == 0 ) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    static long nextFibonacci(int n)
    {
        double a = n * (1 + Math.sqrt(5)) / 2.0;
        return Math.round(a);
    }
}
