package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            print10(n);
        }
        static void print7(int n){
            for (int i = 0 ; i < n; i++ ) {
                for (int j = 0; j < n-i-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n-i-1; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        static void print8(int n){

            for (int i = 0 ; i < n; i++ ) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*n - 2*i -1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
        static void print9(int n){
            for (int i = 1; i <= 2*n-1 ; i++) {
                int stars = i;
                if (i>n) stars = 2*n-i;
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        static void print10(int n){
            int start = 1;
            for (int i = 0; i < n; i++) {
                if (i%2==0) start =1;
                else start = 0;
                for (int j = 0; j <= i ; j++) {
                    System.out.print(start+" ");
                    start = 1 - start;
                }
                System.out.println();
            }
        }
}