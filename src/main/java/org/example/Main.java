package org.example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(List.of(1, 2, 3));

        for (Integer i : list) {
            if (i == 2) {
                list.add(4);
            }
        }

        System.out.println(list);
    }
}