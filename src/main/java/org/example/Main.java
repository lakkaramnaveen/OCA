package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // StriverPatterns.print19(5);
        List<Integer> li = Arrays.asList(1,12,3,4,5,6,7);
        System.out.println(li.parallelStream().filter(n -> n % 2 == 0).map(s -> s * s).reduce(0, (c, e) -> c + e));
    }
}