package org.example;

public class StriverPatterns {
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
    // 8, 9 together is 10
    static void print11(int n){
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
    static void print12(int n){
        int space = 2*(n-1);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
    }
    static void print13(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    }
    static void print14(int n){
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void print15(int n){
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+(n-i-1) ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void print16(int n){
        char cha = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cha+"");
            }
            cha++;
            System.out.println();
        }
    }
    static void print17(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakPoint = (2*i-1)/2;
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(ch);
                if (j<=breakPoint){
                    ch++;
                }else{
                    ch--;
                }
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print18(int n){
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('E'- i); j <= 'E' ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
