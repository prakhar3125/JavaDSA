package com.Crux.String;

import java.util.*;

public class containsVowel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // Read the input string
        System.out.println(goodString(str)); // Print the longest good substring
        scanner.close(); // Close the scanner
    }

    public static String goodString(String str) {
        int i = 0; // Start of the sliding window
        int j = 0; // End of the sliding window
        int maxcount = 0; // To keep track of the maximum length of the good substring
        int start = 0; // To store the start index of the longest good substring
        int end = 0; // To store the end index of the longest good substring

        // Traverse through the string with the end of the window 'j'
        while (j < str.length()) {
            // Check if the current window [i, j+1] is a good string (all vowels)
            if (isVowel(str.substring(i, j + 1))) {
                j++; // If it is a good string, move the end of the window forward
                // Update the maximum length and indices found so far
                if (j - i > maxcount) {
                    maxcount = j - i;
                    start = i;
                    end = j;
                }
            } else {
                // If a non-vowel character is found, move the start of the window to j+1
                // This resets the window to start after the non-vowel character
                i = ++j;
            }
        }
        return str.substring(start, end); // Return the longest good substring
    }

    public static boolean isVowel(String str) {
        // Check if the entire substring contains only vowels
        for (int k = 0; k < str.length(); k++) {
            char c = str.charAt(k);
            // If any character is not a vowel, return false
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                return false;
            }
        }
        return true; // Return true if all characters are vowels
    }
}
