package org.example;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("code");
        String s2 = "code";
        String s3 = s2;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);

    }
}