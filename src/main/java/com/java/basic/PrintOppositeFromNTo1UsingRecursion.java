package com.java.basic;

import java.util.Scanner;

public class PrintOppositeFromNTo1UsingRecursion {

    private static void printOpposite(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printOpposite(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        printOpposite(n);
    }

}
