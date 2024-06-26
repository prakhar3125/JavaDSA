package com.Crux.Recursion;

public class CoinToss {


    // Recursive helper method to generate combinations
    public static void printCombinationsHelper(String result, int n) {
        // Base case: if no more coins to toss, print the result
        if (n == 0) {
            System.out.println(result);
            return;
        }

        // Recursive case: append 'H' or 'T' and recurse for the next coin
        printCombinationsHelper(result + "H", n - 1);
        printCombinationsHelper(result + "T", n - 1);
    }

    public static void main(String[] args) {
        int n = 3; // Number of coins
        printCombinationsHelper("",n);
    }
}
