package org.example;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000 ; i++) {
            System.out.println("I am executed by a child thread");
            System.out.println("am a daemon " + Thread.currentThread().isDaemon());
        }
    }
}
