package com.example.anglesbrackets;

import java.util.Stack;

public class Angles {

    public  static String angleBrackets(String st) {


        Stack<Character> angles = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '<') {
                angles.push('<');
                builder.append('<');
            }
            else {
                if (angles.isEmpty()) {
                    builder.append('<');
                    builder.append(st.charAt(i));

                } else {
                    angles.pop();
                    builder.append(st.charAt(i));


                }
            }


        }
while (!angles.isEmpty()){
    angles.pop();

    builder.append('>');
}

        return  builder.toString();

    }


}
