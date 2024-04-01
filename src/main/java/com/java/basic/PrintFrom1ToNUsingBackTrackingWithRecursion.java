package com.java.basic;

import java.util.Scanner;

public class PrintFrom1ToNUsingBackTrackingWithRecursion {

    private static void printUsingBackTracking(int n) {
        if (n < 1) {
            return;
        }
        printUsingBackTracking(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        printUsingBackTracking(n);
    }

}
