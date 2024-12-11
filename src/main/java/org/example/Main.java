package org.example;

public class Main {
    public static void main(String[] args) {
        Long var1 = Long.valueOf(123);
        Long var2 = Long.valueOf("123");
        System.out.println(var1 == var2);

        Long var3 = Long.valueOf(223);
        Long var4 = Long.valueOf(223);
        System.out.println(var3 == var4);
    }
}