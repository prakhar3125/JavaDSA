package com.Crux.Array2D;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19}};
        Display(arr);
        transpose(arr);
        Display(arr);
    }
    public static void Display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                swap(arr,i,j);
            }
        }


    }
    public static void swap(int[][] arr , int i , int j){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;


    }

}
