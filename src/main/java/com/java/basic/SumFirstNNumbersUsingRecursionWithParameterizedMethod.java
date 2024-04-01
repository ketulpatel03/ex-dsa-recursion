package com.java.basic;

import java.util.Scanner;

public class SumFirstNNumbersUsingRecursionWithParameterizedMethod {

    private static int sum = 0;

    private static void sumNumbers(int n) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n:");
        int n = scanner.nextInt();
        sumNumbers(n);
    }

}
