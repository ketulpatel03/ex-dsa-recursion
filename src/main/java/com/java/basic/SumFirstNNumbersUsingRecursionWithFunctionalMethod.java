package com.java.basic;

import java.util.Scanner;

public class SumFirstNNumbersUsingRecursionWithFunctionalMethod {

    private static int sum = 0;

    private static int sumNumber(int n) {
        if (n == 0) {
            return 0;
        }
        sum = n + sumNumber(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n:");
        int n = scanner.nextInt();
        System.out.println(sumNumber(n));
    }

}
