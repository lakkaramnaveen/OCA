package org.example;

public class Main {
    public static void main(String[] args) {
        //int x = 0;

//        for(int i =0;i<x;i++){
//            System.out.println(i);
//            //10 times
//        }
//        //variable
//
//        while(x<5){
//            System.out.println(x);
//            x++;
//        }

        int x = 10;
        double y = 20.5;

        System.out.println(x.getClass().getSimpleName()); // Output: int
        System.out.println(y.getClass().getSimpleName()); // Output: double

        byte sum = (byte) 1240;
        int total = 48764;
        long population = 214748368;
        System.out.println(population.getClass().getSimpleName());
        do{
            System.out.println(x);
        }while(x++<5);
    }
}