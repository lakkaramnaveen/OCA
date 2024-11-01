package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
        Stream<Integer> s1 = list.stream().filter(n->n%2==0).sorted();

        Stream<Integer> s2 = list.stream().filter(n->n%2==0);


        for(Integer i1: l1) {
            System.out.println(i1);
        }
        System.out.println(count);

        System.out.println(s1);
        s1.forEach(s-> System.out.println(s));

        Object[] o1 = s2.toArray();
        for (Object o : o1) {
            System.out.println(o);
        }
    }
}
