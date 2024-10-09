package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String originalString = "decode";
        String toBeChecked = "decode";
        int rotateCharacters = 6;
        System.out.println(checkForRotation(originalString, toBeChecked));
        System.out.println(leftRotate(originalString, rotateCharacters));
        System.out.println(rightRotate(originalString, rotateCharacters));
    }

    private static String rightRotate(String originalString, int r) {
        int partition = originalString.length() - r;
        return originalString.substring(partition) + originalString.substring(0,partition);
    }

    private static String leftRotate(String originalString, int r) {
        return originalString.substring(r) + originalString.substring(0,r);
    }

    private static boolean checkForRotation(String originalString, String toBeChecked) {
        String concatenatedString = originalString + originalString;
        if(concatenatedString.contains(toBeChecked)){
            return true;
        }
        return false;
    }
}