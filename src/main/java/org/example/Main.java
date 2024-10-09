package org.example;

public class Main {
    public static void main(String[] args) {
        String originalString = "code";
        String subString = originalString.substring(1,3);
        originalString = null;

        System.out.println(subString);

    }
}