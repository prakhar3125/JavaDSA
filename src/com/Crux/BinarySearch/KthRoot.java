package com.Crux.BinarySearch;

public class KthRoot {
    public static void main(String[] args) {
        int n = 143; // Example value for N
        int k = 3;
        System.out.println(findLargest(k,n));
    }

    public static int findLargest(int k , int n){
        int l = 1;
        int h = n;
        int result = 0;
        while(l<=h){
            int mid = (l+h)/2;
            if(Math.pow(mid, k)<=n){
                result = mid;
                l = mid+1;

            }
            else{
                h=mid-1;
            }
        }
        return result;

    }
}




