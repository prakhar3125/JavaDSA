package com.Crux.Array2D;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr =   {{1, 2, 3, 4},
                        {6, 7, 8, 9},
                        {11, 12, 13, 14}
                        };
        printSpiral(arr);
    }

    public static void printSpiral(int[][] arr){
        int i=0;
        int j=0;
        int minR=0;
        int maxR=arr.length-1;
        int minC=0;
        int maxC=arr[0].length-1;
        int n = arr.length*arr[0].length;

        int count=0;
        while(minR<=maxR && minC<=maxC){
            while(j<=maxC && count<n){
                System.out.print(arr[i][j] + " ");
                j++;
                count++;
            }
            j--;
            i++;
            while(i<=maxR && count<n ){
                System.out.print(arr[i][j] + " ");
                i++;
                count++;
            }
            i--;
             j--;
            while(j>=minC && count<n){
                System.out.print(arr[i][j] + " ");
                j--;
                count++;
            }
            j++;
            i--;
            while(i>minR && count<n){
                System.out.print(arr[i][j] + " ");
                i--;
                count++;

            }
            i++;
            j++;
            minR++;
            minC++;
            maxR--;
            maxC--;

        }

    }

}
