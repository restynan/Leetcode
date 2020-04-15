package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input  =  new Scanner(System.in);
        String original = input.nextLine();



        ReverseString obj = new ReverseString();

        System.out.println (obj.reverseWithStringBuilder(original));
        System.out.println (obj.reverseManually(original));

    }
}
