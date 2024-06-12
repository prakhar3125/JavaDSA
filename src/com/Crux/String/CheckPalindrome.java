package com.Crux.String;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "radar"; // Replace with your string
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase to handle case sensitivity
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters from the beginning and end of the string
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
}
