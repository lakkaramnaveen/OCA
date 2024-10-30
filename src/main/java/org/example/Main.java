package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Predicate<String> p = s1 -> s1.length() > 5;
//        System.out.println(p.test("code dfecode"));
//
//        Predicate<String> p1 = s1 -> s1.length() % 2 == 0;
//        System.out.println(p1.test("cod"));
//
//        // Predicate Joining
//        System.out.println(p.and(p1).test("toyota"));
//

        // Function
        // Square function
        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(2));


    }
}