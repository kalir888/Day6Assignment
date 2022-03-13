package com.company;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String args[]){
        int thousands = 0;
        int fiveHundreds = 0;
        int hundreds = 0;
        int fiftys = 0;
        int tens = 0;
        int fives = 0;
        int twos = 0;
        int ones =0;
        int numberOfNotes;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount for which you need change");
        int userAmount = in.nextInt();
        int userAmounttemp = userAmount;
        thousands = userAmounttemp/1000;
        userAmounttemp = userAmounttemp - (thousands*1000);
        fiveHundreds = userAmounttemp/500;
        userAmounttemp = userAmounttemp - (fiveHundreds*500);
        hundreds = userAmounttemp/100;
        userAmounttemp = userAmounttemp - (hundreds*100);
        fiftys = userAmounttemp/50;
        userAmounttemp = userAmounttemp - (fiftys*50);
        tens = userAmounttemp/10;
        userAmounttemp = userAmounttemp - (tens*10);
        fives = userAmounttemp/5;
        userAmounttemp = userAmounttemp - (fives*5);
        twos = userAmounttemp/2;
        userAmounttemp = userAmounttemp - (twos*2);
        ones = userAmounttemp;
        numberOfNotes = thousands+fiveHundreds+hundreds+fiftys+tens+fives+twos+ones;
        System.out.println("Minimum Notes = " + numberOfNotes);
        if (thousands != 0)
            System.out.println("thousands = " + thousands);
        if (fiveHundreds != 0)
            System.out.println("fiveHundred = " + fiveHundreds);
        if (hundreds != 0)
            System.out.println("hundreds = " + hundreds);
        if (fiftys != 0)
            System.out.println("fiftys = " + fiftys);
        if (tens != 0)
            System.out.println("tens = " + tens);
        if (fives != 0)
            System.out.println("fives = " + fives);
        if (twos != 0)
            System.out.println("twos = " + twos);
        if (ones != 0)
            System.out.println("ones = " + ones);
    }
}
