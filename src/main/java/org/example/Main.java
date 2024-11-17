package org.example;

public class Main {
    public static void main(String[] args) {
        byte sum = (byte) 1240;
        int total = 48764;
        long population = 214748L;
        System.out.println(((Object) population).getClass().getSimpleName());

        long baseDecimal = 100_267_760;
        long octVal = 04_13;
        long hexVal = 0x10_BA_75;
        long binVal = 0b1_0000_10_11;
    }
}