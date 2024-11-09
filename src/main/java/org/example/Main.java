package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // StriverPatterns.print19(5);
        List<Integer> li = Arrays.asList(1,223,21,121,31);
        Stream<Integer> myDataStream = li.stream();
        myDataStream.forEach(i-> System.out.println(i));
//        myDataStream.forEach(i-> System.out.println(i));

    }
}