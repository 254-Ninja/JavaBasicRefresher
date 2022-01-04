package com.example.javabasicrefresher;

public class checkIfAVowelIsPresentInTheString {
    public static void main(String[]args){
        System.out.println(checkIfAVowelIsPresentInTheString("Hello"));

        //true
        System.out.println(checkIfAVowelIsPresentInTheString("TV"));

        //false
        public static boolean checkIfAVowelIsPresentInTheString(String input){
            return
                    input.toLowerCase().matches(.*[aeiou].*)
        };

    }
}
