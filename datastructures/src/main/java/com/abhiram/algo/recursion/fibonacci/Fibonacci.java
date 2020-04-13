package com.abhiram.algo.recursion.fibonacci;

public abstract class Fibonacci {

    public int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    static long nextFibonacci(int n) {
        double a = n * (1 + Math.sqrt(5)) / 2.0;
        return Math.round(a);
    }

    //A number is Fibonacci if and only if
    // one or both of (5*n2 + 4) or (5*n2 – 4)
    // is a perfect square
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }
}
