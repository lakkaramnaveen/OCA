package org.example;

public class Main {
    public static void main(String[] args) {
        String s1 = "code";
        String s3 = "code";
        System.out.println(s1 == s3);

        String s2 = new String("code");
        String s4 = new String("code");
        System.out.println(s2 == s4);
    }
}