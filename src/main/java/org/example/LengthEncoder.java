package org.example;

public class LengthEncoder {
    public static String lengthEncoder(String str){
        int counter = 0;
        String ret = "";
        int len = str.length();
        for(int i = 0; i <  len; i++){
            counter = 1;
            while(i<len-1 && str.charAt(i) == str.charAt(i+1)){
                counter++;
                i++;
            }

            ret += str.charAt(i) + "" + counter;
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(lengthEncoder("aaabbc"));

        String str = new String("Zephyr");
        int length = str.length();
        System.out.println(length);
        String[] st = str.split("");
        for (String st1: st){
            System.out.println(st1);
        }
        for(int i = length -1; i >= 0; i--) {
            System.out.print(st[i] + ", ");
        }
    }
}
