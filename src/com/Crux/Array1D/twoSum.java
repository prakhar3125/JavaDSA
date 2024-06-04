package com.Crux.Array1D;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        display(Sum(arr,9));

    }
    public static int[] Sum(int[] arr, int target) {
        int[] brr = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i]+arr[j]==target  ){
                    brr[0]=i;
                    brr[1]=j;
                }
            }
        }
        return brr;

    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
