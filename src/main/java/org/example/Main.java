package org.example;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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