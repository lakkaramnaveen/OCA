package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
        private static final List<Integer> list = new ArrayList<>();

        public static void main(String[] args) {
            for (int i = 0; i < 1000; i++) {
                new Thread(() -> list.add(i)).start();
            }
        }
}