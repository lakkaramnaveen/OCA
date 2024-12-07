package org.example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        int marks = 8;
        int total = 10;
        System.out.println(total < marks && ++marks > 5);
        System.out.println(marks);
        System.out.println(total < 12 || ++marks > 10);
        System.out.println(marks);
    }
}