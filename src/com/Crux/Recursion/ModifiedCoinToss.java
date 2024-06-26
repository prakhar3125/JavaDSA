package com.Crux.Recursion;
//no 2 consecutive heads
public class ModifiedCoinToss {

    static int count=0;
    // Recursive helper method to generate combinations
    public static void printCombinationsHelper(String result, int n) {
        // Base case: if no more coins to toss, print the result
        if (n == 0) {
            System.out.println(result);
            count++;
            return;
        }

        // Recursive case: append 'T' and recurse for the next coin
        printCombinationsHelper(result + "T", n - 1);

        // Only append 'H' if the last character is not 'H'
        if (result.length()==0 || result.charAt(result.length() - 1) != 'H') {
            printCombinationsHelper(result + "H", n - 1);
        }
    }



    public static void main(String[] args) {
        int n = 3; // Number of coins
        printCombinationsHelper("",n);
        System.out.println(count);
    }
}
