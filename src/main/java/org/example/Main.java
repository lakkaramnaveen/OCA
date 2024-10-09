package org.example;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDuplicatesUsingFor("code decode"));
        System.out.println(findDuplicatesUsingArrays("code decode"));
        System.out.println(findDuplicatesUsingMaps("code decode"));
    }

    private static Set<Character> findDuplicatesUsingMaps(String codeDecode) {
        Set<Character> duplicates = new LinkedHashSet<>();
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        for (int i = 0; i < codeDecode.length(); i++){
            if(countMap.containsKey(codeDecode.charAt(i))){
                countMap.put(codeDecode.charAt(i), countMap.get(codeDecode.charAt(i)) + 1);
            }else{
                countMap.put(codeDecode.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: countMap.entrySet()) {
            if (entry.getValue()>1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    private static Set<Character> findDuplicatesUsingArrays(String name){
        Set<Character> duplicates = new LinkedHashSet<>();
        int[] arrayForChar = new int[256];

        for(int i=0;i<name.length();i++){
            arrayForChar[name.charAt(i)] = arrayForChar[name.charAt(i)] + 1;
        }

        for(int i =0;i<256;i++){
            if(arrayForChar[i]>1){
                duplicates.add((char) i);
            }
        }

        return duplicates;
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