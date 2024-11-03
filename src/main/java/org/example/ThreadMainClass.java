package org.example;

public class ThreadMainClass {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("I am executed by a main thread");
        }
    }
}
