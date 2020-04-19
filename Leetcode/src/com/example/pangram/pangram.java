package com.example.pangram;

public class pangram {
    public static boolean isPangram(String s) {

        boolean arr[] = new boolean[26];
        int index;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                index = s.charAt(i) - 'A';
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';
            } else {
                continue;
            }
            arr[index] = true;

        }
        for (boolean value : arr) {
            if (!value ) {
                return false;
            }
        }


        return true;
    }


}
