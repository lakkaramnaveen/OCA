package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now().getYear());
//        System.out.println(LocalDateTime.now().getNano());
//        int[] ar = {1,3,232,242,12,121};
//
//        for (int i = 0; i < ar.length - 1; i++) {
//            if (ar[i]<ar[i+1]){
//                continue;
//            } else {
//                int temp = ar[i];
//                ar[i] = ar[i+1];
//                ar[i+1] = temp;
//            }
//        }
//
//        for (int a : ar){
//            System.out.println(a);
//        }

        int array[] = {1,2,3};
        int array2[] = new int[5];

        array2 = array;

        for (int i : array2){
            System.out.print(i);
        }
        System.out.println();

        int array3[] = new int[3];

        array3 = array;

        for (int i : array3){
            System.out.print(i);
        }
//        for (int a : ar){
//            System.out.println(a);
//        }

        String text = null;
        String result = switch (text) {
            case null -> "Text is null";
            case String s && s.length() > 5 -> "Long text";
            default -> "Short text";
        };
        System.out.println(result);
    }
}