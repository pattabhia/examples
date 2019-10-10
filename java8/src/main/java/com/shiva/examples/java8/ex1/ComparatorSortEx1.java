package com.shiva.examples.java8.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortEx1 {

    public static void main(String[] args) {
        List<String> asterisks = Arrays.asList("****","*","**","***");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(),o1.length());
            }
        };
        Collections.sort(asterisks,comparator);
        asterisks.forEach(System.out::println);
    }
}
