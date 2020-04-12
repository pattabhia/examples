package com.abhiram.algo.recursion.fibonacci;

public class FibonacciWithOutRecursion {

    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3, i;
        System.out.println(n1 + " " + n2);
        int count = 10;
        for (int j = 2; j < count; ++j) {
            n3 = n1 + n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
