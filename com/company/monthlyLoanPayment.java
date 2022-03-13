package com.company;



public class monthlyLoanPayment {
    public static void main(String args[]){
        int principle = Integer.parseInt(args[0]);
        int yearsToPay = Integer.parseInt(args[1]);
        double interestForYear = Integer.parseInt(args[2]);
        int numberOfMonths = 12 * yearsToPay;
        double interstForMonth = interestForYear / 1200;
        double monthlyPayment = (principle*interstForMonth) / (1 -Math.pow((1+interstForMonth),-numberOfMonths));
        monthlyPayment = Math.round(monthlyPayment);
        System.out.println("monthly payment for your loan is   = " + monthlyPayment);
    }
}
