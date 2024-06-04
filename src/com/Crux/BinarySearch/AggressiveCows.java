package com.Crux.BinarySearch;
import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 3, 4, 7}; // Example stall positions
        int m = 3; // Number of cows

        System.out.println(maximumMinimumDistance(stalls, m));
    }

    public static boolean isValid(int[] stalls, int m, int mid) {
        int cowsPlaced = 1;
        int position = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - position >= mid) {
                cowsPlaced++;
                position = stalls[i];
                if (cowsPlaced >= m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int maximumMinimumDistance(int[] stalls, int m) {
        Arrays.sort(stalls);
        int l = 0;
        int h = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isValid(stalls, m, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}






/*
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1 ... xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
Input
t – the number of test cases, then t test cases follows.
* Line 1: Two space-separated integers: N and C
* Lines 2..N+1: Line i+1 contains an integer stall location, xi
Output
For each test case output one integer: the largest minimum distance.
Example
Input:

1
5 3
1
2
8
4
9
Output:

3
 */