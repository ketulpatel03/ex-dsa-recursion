package com.java.basic;

import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {

    private static int[] returnArr;
    private static int count = 0;

    private static int[] reverseAnArray(int[] arr, int n) {
        if (count == arr.length) {
            return returnArr;
        }
        returnArr[count] = arr[n - 1];
        count++;
        reverseAnArray(arr, n - 1);
        return returnArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        returnArr = new int[arr.length];
        System.out.println(Arrays.toString(reverseAnArray(arr, arr.length)));
    }
}
