package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Function
        // Square function
        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(2));

        // Cube function
        Function<Integer, Integer> f1 = i -> i * i * i;
        System.out.println(f1.apply(2));
    }
}