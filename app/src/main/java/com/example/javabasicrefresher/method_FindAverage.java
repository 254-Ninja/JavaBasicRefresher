package com.example.javabasicrefresher;

import java.util.Scanner;

public class method_FindAverage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the first number: ");
        double y = in.nextDouble();
        System.out.print("Input the first number : ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n");
    }
    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
            }

}
