package com.Crux.Array1D;

public class MaxSubarraySumBrute {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int sum=0;
        int msum=0;
        int fsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=0;;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>msum){
                    msum=sum;
                }
            }
        }
        return msum;
    }
}
