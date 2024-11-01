package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(36);
        list.add(12);
        list.add(34);
        list.add(21);
        // Stream filters even
        List<Integer> l1 = list.stream().filter(n->n%2==0).toList();
        // Count
        Long count = list.stream().filter(n->n%2==0).count();
        // Sort
        list.stream().filter(n->n%2==0).sorted().forEach(s-> System.out.println(s));
    }
}
