package com.company;

import java.util.Scanner;

public class temperatureUnitConversion {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("for celsius to farenheit press 1");
        System.out.println("for farenheit to celsius press 2");
        byte userOption = in.nextByte();
        if (userOption == 1){
            System.out.println("Enter your temperature in celsius");
            double userTempInC = in.nextInt();
            double userTempToF = (userTempInC * 9/5) + 32;
            System.out.println("your temperature in farenheit is = " + userTempToF + "*F");
        }else if (userOption == 2){
            System.out.println("Enter your temperature in farenheit");
            double userTempInF = in.nextInt();
            double userTempToC = (userTempInF - 32) * 5/9;
            System.out.println("your temperature celcius is = " + userTempToC + "*C");
        }
    }
}
