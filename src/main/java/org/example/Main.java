package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sorting
        int[] ar = {1,23,45,12,3,5,2,7,24, 3, 4232, 32};
        int n = ar.length;
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]= temp;
                }
            }
        }
        for (int i: ar){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] ar1 = {1,23,45,12,3,5,2,7};
        Arrays.stream(ar1).sorted().forEach(i-> System.out.print(i+" "));
    }
}