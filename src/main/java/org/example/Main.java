package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDuplicatesUsingFor("code decode"));
    }

    private static Set<Character> findDuplicatesUsingFor(String codeDecode) {
        Set<Character> duplicates = new LinkedHashSet<>();

        for(int i=0; i<codeDecode.length();i++){
            for(int j=i+1; j<codeDecode.length();j++) {
                if(codeDecode.charAt(i)==codeDecode.charAt(j)){
                    duplicates.add(codeDecode.charAt(j));
                }
            }
        }

        return duplicates;
    }
}