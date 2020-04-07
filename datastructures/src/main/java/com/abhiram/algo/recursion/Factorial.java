package com.abhiram.algo.recursion;

public class Factorial {

    public static void main(String[] args) {

        int n =2;
        int factorial = factorial(n);
        System.out.printf("factorial of %d is %d:", n, factorial);

    }

    private static int factorial(int num) {
        if(num==0) {
            return 1;
        }

        return (num* factorial(num-1));
    }

}
