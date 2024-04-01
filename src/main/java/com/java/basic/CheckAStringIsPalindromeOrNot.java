package com.java.basic;

public class CheckAStringIsPalindromeOrNot {

    private static boolean checkPalindrome(int i, char[] s) {
        if (i >= (s.length / 2)) {
            return true;
        }
        if (s[i] != s[s.length - i - 1]) {
            return false;
        }
        return checkPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(checkPalindrome(0, str.toCharArray()));
    }

}
