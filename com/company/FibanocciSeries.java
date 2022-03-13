package com.company;

import java.util.Scanner;

public class FibanocciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth term till Which you want the Fibanocci series");
        int userLimit = in.nextInt();
        int a = 0;
        if (userLimit == 1)
            System.out.println(a);
        else if (userLimit == 0)
            System.out.println("invaid term");
        else {
            System.out.print(a);
            int b = 1;
            System.out.print(" " + b);
            int c;
            for (int i = 3; i <= userLimit; i++) {
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
    }
}
