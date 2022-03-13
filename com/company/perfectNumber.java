package com.company;


import java.util.Scanner;

public class perfectNumber {
    public static final int IS_DIVISIBLE = 0;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to find whether it is perfect number or not");
        int userNum = in.nextInt();
        int divisorLimit = userNum/2;
        int divisorsTotal = 0;
        for (int i = 1; i <= divisorLimit; i++ ){
            int diviCheck = userNum%i;
            if (diviCheck == IS_DIVISIBLE)
                divisorsTotal = divisorsTotal + i;
        }
        if (divisorsTotal == userNum)
            System.out.println(userNum + " is a perfect number");
        else
            System.out.println(userNum + " is not a perfect number");
    }
}
