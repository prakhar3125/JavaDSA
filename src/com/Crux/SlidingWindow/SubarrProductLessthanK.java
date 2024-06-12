package com.Crux.SlidingWindow;

public class SubarrProductLessthanK {
    public static void main(String[] args) {
        int[] arr = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};

        System.out.println(sliding(arr,19));

    }
    public static int sliding(int[]arr , int k){
       int l=0;
       int r=0;
       int p=1;
       int count=0;
       while(r<arr.length){
           //growing
           p*=arr[r];
           //shrinking
           while(p>=k && l<=r){
               p/=arr[l];
               l++;
           }
           //ans
           count+=r-l+1;
           r++;

       }
       return count;

    }
}
