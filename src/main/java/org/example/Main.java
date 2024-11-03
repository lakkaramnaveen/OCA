package org.example;

public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.setDaemon(false);
        threadClass.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("In main thread");
        }
    }
}