package com.shiva.examples.java8.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachEx1 {
    public static void main(String[] args) {
        List<String> asteriks = Arrays.asList("****","***","**","*");
        Consumer<String> consumer = s -> System.out.println(s);
        asteriks.forEach(consumer);
    }

}
