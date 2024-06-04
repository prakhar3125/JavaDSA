package com.Crux.Array2D;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19}};
        System.out.println(searchMatrix(arr,17));
    }




    public static boolean searchMatrix(int[][] arr, int target) {
        int i=0;
        int j = arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                return true;
            }
            else if(target>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        return false;

    }
}
