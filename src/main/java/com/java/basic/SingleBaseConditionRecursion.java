package com.java.basic;

public class SingleBaseConditionRecursion {

    private static int count = 0;

    public static void main(String[] args) {
        testFunction();
    }

    private static void testFunction() {
        if (count == 3) {
            return;
        }
        System.out.println(count);
        count++;
        testFunction();
    }

}
