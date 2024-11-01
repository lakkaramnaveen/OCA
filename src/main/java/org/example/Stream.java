package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(21);

        List<Integer> l1 = list.stream().filter(n->n%2==0).toList();
        Long count = list.stream().filter(n->n%2==0).count();
        for(Integer i1: l1) {
            System.out.println(i1);
        }
        System.out.println(count);
    }
}
