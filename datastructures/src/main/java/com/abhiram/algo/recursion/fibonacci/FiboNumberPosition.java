package com.abhiram.algo.recursion.fibonacci;

public class  FiboNumberPosition extends Fibonacci {

    public FiboNumberPosition() {
        super();
    }

    public static void main(String[] args) {
        int num = 25;
        int result = new FiboNumberPosition().fibonacci(num);
        System.out.printf(" %d position of fibonacci series is %d", num, result);
    }

    @Override
    public int fibonacci(int num) {
        return super.fibonacci(num);
    }
}


