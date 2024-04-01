package com.java.basic;

import java.util.Scanner;

public class PrintLinearlyFrom1ToNUsingRecursion {

    private static int count = 1;

    private static void printLinearly(int n) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        count++;
        printLinearly(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n times: ");
        int n = scanner.nextInt();
        printLinearly(n);
    }

}
