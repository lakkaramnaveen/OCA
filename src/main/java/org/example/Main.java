package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // StriverPatterns.print19(5);
        List<Integer> li = Arrays.asList(1,12,3,4,5,6,7);
        li.stream().filter(n-> n%2!=0).map(s->s*s).sorted().forEach(s-> System.out.println(s));
    }
}