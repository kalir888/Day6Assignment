package com.company;

import java.util.Scanner;

public class primeNumber {
    public static final int IS_PRIME = 0;
    public static final int IS_NOT_PRIME = 1;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number to check it is prime or not: ");
        int userNum = in.nextInt();
        int primeCheck = IS_PRIME;
        int i = 2;
        while (i*i <= userNum & primeCheck == IS_PRIME ) {
            int diviCheck = userNum % i;
            if (diviCheck == perfectNumber.IS_DIVISIBLE)
                primeCheck = IS_NOT_PRIME;
            i++;
        }
        if (primeCheck == IS_PRIME)
            System.out.println(userNum + " is a prime number");
        else
            System.out.println(userNum + " is not a prime number");
    }
}
