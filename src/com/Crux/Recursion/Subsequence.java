package com.Crux.Recursion;

public class Subsequence {
    public static void printSubsequences(String input_str, String output_str) {
        if (input_str.length() == 0) {
            System.out.println(output_str);
            return;
        }

        char ch = input_str.charAt(0);
        String remaining_str = input_str.substring(1);

        // Exclude the current character
        printSubsequences(remaining_str, output_str);

        // Include the current character
        printSubsequences(remaining_str, output_str + ch);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "");
    }
}
