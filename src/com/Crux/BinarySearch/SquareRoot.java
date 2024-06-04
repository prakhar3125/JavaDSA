package com.Crux.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int l = 1;
        int h = x;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(Math.pow(mid,2)<=x){
                ans = mid;
                l = mid+1;

            }
            else{
                h=mid-1;
            }
        }
        return ans;

    }
}
