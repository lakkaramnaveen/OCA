package org.example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Character char1 = 'a';
        Byte byte1 = 10;
        Double double1 = 10.98;

        Boolean bool4 = Boolean.valueOf(true);
        Boolean bool5 = Boolean.valueOf(true);
        Boolean bool6 = Boolean.valueOf("TrUE");
        Double double4 = Double.valueOf(10);
    }
}