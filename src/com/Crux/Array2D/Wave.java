package com.Crux.Array2D;

public class Wave {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19}};
        wavePatter(arr);
    }


    public static void wavePatter(int[][] arr) {
        int i = 0;  // Initialize row index
        int j = 0;  // Initialize column index
        int count = arr.length * arr[0].length;  // Calculate the total number of elements in the array
        while (j < arr[0].length) {  // Loop through each column
            // Traverse down the current column
            while (i < arr.length) {
                System.out.print(arr[i][j] + " ");  // Print the current element
                count--;  // Decrement the count of remaining elements
                i++;  // Move to the next row
            }
            i--;  // Move back to the last valid row index after overshooting
            j++;  // Move to the next column
            if (count == 0) {  // Check if all elements have been printed
                break;  // Exit the outer loop if done
            }
            // Traverse up the current column
            while (i >= 0) {
                System.out.print(arr[i][j] + " ");  // Print the current element
                count--;  // Decrement the count of remaining elements
                i--;  // Move to the previous row
            }
            i++;  // Move back to the first valid row index after overshooting
            j++;  // Move to the next column
        }
    }



}
