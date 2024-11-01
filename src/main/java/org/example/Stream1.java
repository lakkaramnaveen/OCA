package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(36);
        list.add(12);
        list.add(21);
        // Stream filters even
        List<Integer> l1 = list.stream().filter(n->n%2==0).toList();
    }
}
