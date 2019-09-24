package com.shiva.algorithms.stack;

public class ArrayStack implements IStack {

    private Object[] array;
    private int size;

    public ArrayStack(int capacity) {
        array = new Object[capacity];
    }

    public void push(Object o) {
        if (size == array.length) {
            throw new IllegalStateException();
        }
        array[size++] = o;
    }

    public static void main(String[] args) {
        ArrayStack a = new ArrayStack(10);
        a.push("10");

    }
}
