package com.java.basic;

import java.util.Scanner;

public class PrintOppositeFromNTo1UsingBackTrackingWithRecursion {

    private static int count;

    private static void printWithBackTracking(int n) {
        if (count < n) {
            return;
        }
        printWithBackTracking(n + 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        count = n;
        printWithBackTracking(1);
    }

}
