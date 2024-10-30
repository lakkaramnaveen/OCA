package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p = s1 -> s1.length() > 5;
        System.out.println(p.test("code dfecode"));
    }
}