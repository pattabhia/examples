package com.abhiram.algo.recursion;

public class FiboNumberPosition {

    public static void main(String[] args) {
        int num = 9;
        int result = fibonacci(num);
        System.out.printf(" %d position of fibonacci series is %d", num, result);
    }

    private static int fibonacci(int num) {
        if (num < 1) {
            return -1;
        }
        if (num == 1 || num == 2) {
            return num-1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
