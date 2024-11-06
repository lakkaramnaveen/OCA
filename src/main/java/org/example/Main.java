package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getNano());
        int[] ar = {1,3,232,242,12,121};

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i]<ar[i+1]){
                continue;
            } else {
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
        }

        for (int a : ar){
            System.out.println(a);
        }
    }
}