package com.Crux.Recursion;

public class PrintCombinations {
    public static void main(String[] args) {
        int n = 4; // Target number to reach
        printCombinations(n, 0, ""); // Start the recursive function
    }

    /**
     * Recursive function to print all combinations to reach 'n' starting from 'curr'.
     *
     * @param n The target number to reach.
     * @param curr The current sum in the path.
     * @param ans The path taken to reach the current sum.
     */
    public static void printCombinations(int n, int curr, String ans) {
        // Base case: if current sum equals target, print the path
        if (curr == n) {
            System.out.print(ans + " ");
            return;
        }

        // If current sum exceeds target, stop further recursion
        if (curr > n) {
            return;
        }

        // Recursive call to add 1 to current sum and append "1" to the path
        printCombinations(n, curr + 1, ans + "1");

        // Recursive call to add 2 to current sum and append "2" to the path
        printCombinations(n, curr + 2, ans + "2");

        // Recursive call to add 3 to current sum and append "3" to the path
        printCombinations(n, curr + 3, ans + "3");
    }
}

