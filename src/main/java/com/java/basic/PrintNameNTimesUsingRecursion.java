package com.java.basic;

import java.util.Scanner;

public class PrintNameNTimesUsingRecursion {

    private static void printName(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.println("name");
        printName(i + 1, N);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N: ");
        int N = scanner.nextInt();

        printName(1, N);
    }

}
