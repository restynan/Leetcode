package com.samples;

import java.util.Stack;

public class reverseString {


    public String reverseWithStringBuilder(String st)
    {
        return    new StringBuilder(st).reverse().toString();

    }

    public String   reverseManually (String s){
        StringBuilder st = new StringBuilder();

        for (int i=s.length()-1;i>0;i--) {
            st.append(s.charAt(i)); }

        return st.toString();

    }

}
