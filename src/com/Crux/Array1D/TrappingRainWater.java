package com.Crux.Array1D;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rain(arr));
    }

    public static int rain(int[] arr) {
        int[] lrr = new int[arr.length];
        int[] rrr = new int[arr.length];
        lrr[0] = arr[0];
        rrr[arr.length - 1] = arr[arr.length - 1];
        int i;
        for (i = 1; i < arr.length; i++) {
            lrr[i] = Math.max(lrr[i - 1], arr[i]);
        }

        for (i = arr.length - 2; i >= 0; i--) {
            rrr[i] = Math.max(rrr[i+1], arr[i]);
        }
        int sum=0;
        for(i=0;i<arr.length;i++){
            sum += Math.min(lrr[i],rrr[i]) - arr[i];
        }

        return sum;

    }
}
