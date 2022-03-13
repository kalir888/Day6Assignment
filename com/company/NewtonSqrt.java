package com.company;

import java.util.Scanner;
public class NewtonSqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to find it's root: ");
        double c = in.nextDouble();
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        System.out.println("square root of given number is = " + t);
    }
}
