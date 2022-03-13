package com.company;

import java.util.Scanner;

public class SwapNibbleInBinary {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to swap the nibbles and fid the new number");
        int userDeci = in.nextInt();
        String bin = Integer.toBinaryString(userDeci);
        System.out.println("the binary form of given number is = " + bin);
        int newNum;
        newNum = ((userDeci & 00001111)<<4 | (userDeci & 11110000)>>4);
        System.out.println("new number = " + newNum);
    }
}
