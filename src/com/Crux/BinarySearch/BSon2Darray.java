package com.Crux.BinarySearch;

public class BSon2Darray {
    public static boolean searchMatrix(int[][] matrix, int key) {
        int m = matrix.length;
        int n = matrix[0].length;
        // Total number of elements
        int total = m * n;
        // Binary search on the imaginary 1D array
        int l = 0;
        int h = total - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            // Convert mid to 2D indices
            int row = mid / n;
            int col = mid % n;
            if (matrix[row][col] == key) {
                return true;
            } else if (matrix[row][col] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BSon2Darray sol = new BSon2Darray();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int key = 3;
        System.out.println(sol.searchMatrix(matrix, key)); // Output: true
    }

}
