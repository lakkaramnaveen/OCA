package org.example.java;

import java.util.function.BiConsumer;

public class Lambda {
    void main(String[] args) {
        System.out.println(addTwoNumbers(2,3));
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(10,5);
    }

    static int addTwoNumbers(int a, int b){
        return  a+b;
    }
}
