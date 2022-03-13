package com.company;

public class dayOfWeek {
    public static void main(String args[]){
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        if (month > 0 & month < 13 & day < 31 & day > 1 & year > 999 & year < 10000) {
            int y = year - (14 - month) / 12;
            int x = y + (y / 4) - (y / 100) + (y / 400);
            int m = month + 12 * ((14 - month) / 12) - 2;
            int dayOfWeek = (day + x + (31 * m) / 12) % 7;
            System.out.println("day of week for your date = " + dayOfWeek);
        }else
            System.out.println("invalid date");
    }
}
