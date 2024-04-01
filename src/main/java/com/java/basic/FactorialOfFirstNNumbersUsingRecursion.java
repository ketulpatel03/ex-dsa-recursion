package com.java.basic;

import java.util.Scanner;

public class FactorialOfFirstNNumbersUsingRecursion {

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

}
