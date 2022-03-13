package com.company;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to reverse it");
        int userNum = in.nextInt();
        int userNumTemp = userNum;
        int singleDigit;
        int rev = 0;
        while (userNumTemp != 0){
            singleDigit = userNumTemp%10;
            rev = (rev*10) + singleDigit;
            userNumTemp = userNumTemp/10;
        }
        System.out.println("reverse of the given number is = " + rev);
    }
}
