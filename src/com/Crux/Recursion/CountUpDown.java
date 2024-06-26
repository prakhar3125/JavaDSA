package com.Crux.Recursion;

public class CountUpDown {

    public static void printNumbers(int current, int n, boolean up) {
        System.out.println(current);
        if (current == n && up) {
            // Reached the middle number, start going down
            printNumbers(current - 1, n, false);
        } else if (up) {
            // Going up
            printNumbers(current + 1, n, true);
        } else if (current > 1) {
            // Going down
            printNumbers(current - 1, n, false);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Replace with your desired number
        printNumbers(1, n, true);
    }
}
