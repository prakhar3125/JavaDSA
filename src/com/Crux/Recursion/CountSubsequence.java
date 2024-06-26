package com.Crux.Recursion;

public class CountSubsequence {
    public static int printAndCountSubsequences(String input_str, String output_str) {
        if (input_str.length() == 0) {
            System.out.println(output_str); // Print the subsequence
            return 1;
        }

        char ch = input_str.charAt(0);
        String remaining_str = input_str.substring(1);

        // Exclude the current character
        int a = printAndCountSubsequences(remaining_str, output_str);

        // Include the current character
        int b = printAndCountSubsequences(remaining_str, output_str + ch);

        return a + b;
    }

    public static void main(String[] args) {
        String str = "abc";
        int count = printAndCountSubsequences(str, "");
        System.out.println("Total subsequences: " + count);
    }
}
