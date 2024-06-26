package com.Crux.SlidingWindow;

public class FreqArray {
    public static void main(String[] args) {
        String str = "abbcdddd";
        int[] frequency = new int[26];  // Array to hold the frequency of each letter (assuming only lowercase a-z)

        // Calculate the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }

        // Print the frequency of each character
        for (int j = 0; j < frequency.length; j++) {
            if (frequency[j] > 0) {  // Only print characters that appear in the string
                System.out.print((char)(j + 'a') + ": " + frequency[j] + " ");
            }
        }
    }
}
