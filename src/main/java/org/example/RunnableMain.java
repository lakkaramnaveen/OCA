package org.example;

public class RunnableMain {
    private int n1;
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
        int n;
        int k;
    }
}
