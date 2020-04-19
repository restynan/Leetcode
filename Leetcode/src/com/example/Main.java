package com.example;

import com.example.anglesbrackets.Angles;
import com.example.pangram.pangram;

public class Main {

    public static void main(String[] args) {
//        int arr[] = {5, 4, 3, 6};
//        System.out.print(combinationSum.findPairs(arr).toString());
       String str=  "The quick brown fox jumps over the lazy dog";
        String str2= "The quick brown fox jumps over the dog";
        System.out.print(pangram.isPangram(str2));

        System.out.print(Angles.angleBrackets("><<><"));



    }


}
