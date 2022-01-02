package com.example.javabasicrefresher;

public class Reversing_a_string_in_Java {

    public static void main (String [] args) {

        String str = "123";
        System.out.println(reverse(str));
    }

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");
        StringBuilder out = new StringBuilder();

        char [] chars = in. toCharArray();
    }
}
