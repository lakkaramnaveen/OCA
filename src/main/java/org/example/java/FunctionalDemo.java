package org.example.java;

@FunctionalInterface
public interface FunctionalDemo {
    abstract void sum(int a, int b);

    static void sum2(int a, int b) {

    }

    default void sum3(int a, int b) {

    }
}
