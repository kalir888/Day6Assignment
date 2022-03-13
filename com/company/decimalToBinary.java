package com.company;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a decimal number to convert into a binary number");
        int userDeci = in.nextInt();
        int tempArray[] = new int[100];
        int i = 0;
        int quot = userDeci;
        while (quot != 0){
            tempArray[i] = quot%2;
            quot = quot/2;
            i++;
        }
        for (int j = i-1; j >= 0; j--){
            System.out.print(tempArray[j]);
            i--;
        }
        System.out.println();
    }
}
