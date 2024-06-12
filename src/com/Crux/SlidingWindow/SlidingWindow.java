package com.Crux.SlidingWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,6,1};
        System.out.println(MaxSum(arr,3));

    }
    public static int MaxSum(int[] arr, int k){
        int i=0;

        int sum=0;
        int maxSum=0;
         for(i=0;i<k;i++){
             sum+=arr[i];


         }
         maxSum=sum;
         i=0;
         for(int m=k;m<arr.length;m++){

             sum+=arr[m]-arr[i];
             maxSum=Math.max(sum,maxSum);
             i++;

         }
         return maxSum;



    }
}
