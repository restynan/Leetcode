package com.example;

public class ReverseString {

    public String reverseWithStringBuilder(String st)
    {
        return    new StringBuffer(st).reverse().toString();

    }

    public String   reverseManually (String s){
       // StringBuilder st = new StringBuilder();
   String str="";
        for (int i=s.length()-1;i>=0;i--) {
           str =   str + s.charAt(i);

        }

        return str;

    }
}
