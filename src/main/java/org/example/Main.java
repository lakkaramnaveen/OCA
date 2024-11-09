package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            StriverPatterns.print16(n);

        }
        // Gives compilation error because we cannot assign non static method output to a static variable
        static int x = count();
        int count() { return 10; }

        // Executes fine if we access static variablas in a non static method

        static int x1 = 0;
        int count1() { return x1; }


}