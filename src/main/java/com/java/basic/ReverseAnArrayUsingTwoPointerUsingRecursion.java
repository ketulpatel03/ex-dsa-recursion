package com.java.basic;

import java.util.Arrays;

public class ReverseAnArrayUsingTwoPointerUsingRecursion {

    static int[] arr = {1, 2, 3, 4, 2, 1};

    private static void reverseAnArray(int l, int r) {
        if (l >= r) {
            return;
        }
        // swap logic
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseAnArray(l + 1, r - 1);
    }

    public static void main(String[] args) {
        reverseAnArray(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
