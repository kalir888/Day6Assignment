package com.company;

import java.util.Scanner;

public class StopWatch {
    public static void main(String args[]){
        long startTime = 0,endTime = 0,timeElapsed,timeInSeconds;
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1 to start the watch");
        byte userOption1 = in.nextByte();
        if (userOption1 == 1) {
            startTime = System.nanoTime();
            System.out.println("enter 2 to stop the watch");
            byte userOption2 = in.nextByte();
            if (userOption2 == 2)
                endTime = System.nanoTime();
        }
        timeElapsed = endTime - startTime;
        timeInSeconds = timeElapsed/1000000000;
        System.out.println("elapsed time in seconds = " + timeInSeconds);
    }
}
