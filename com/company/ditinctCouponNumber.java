package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ditinctCouponNumber {
    public static final int IS_FINISHED = 0;
    public static final int YES = 1;
    public static final int NO = 2;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter number of coupons you want");
        int numberOfCoupons = in.nextInt();
        int repeatCheck;
        int random;
        int numberOfRandom = 0;
        int i;
        int j = 1;
        int coupon = numberOfCoupons;
        Integer couponArray[] = new Integer[numberOfCoupons];
        Arrays.fill(couponArray,j);
        System.out.println(Arrays.toString(couponArray));
        while (coupon != IS_FINISHED) {
            random = rand.nextInt(numberOfCoupons) + 1;
            System.out.println("random number = " + random);
            numberOfRandom++;
            repeatCheck = NO;
            i = 0;
            while (i < couponArray.length & repeatCheck == NO){
                if (couponArray[i++] == random) {
                    repeatCheck = YES;
                    System.out.println("repeatcheck is = " + repeatCheck);
                }
            }
            if (repeatCheck == NO) {
                couponArray[j] = random;
                j++;
                coupon--;
            }
        }
        System.out.println(Arrays.toString(couponArray));
        System.out.println("number of random number needed = " + numberOfRandom);
    }
}
