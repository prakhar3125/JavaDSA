package com.Crux.BinarySearch;

public class PerfectSquare {

    public static boolean isPerfectSquare(int num) {
        int l=1;
        int h=num;
        int ans = 0;
        while(l<=h){
            int mid = l+ (h-l)/2;
            if(Math.pow(mid,2)==num){
                return true;
            }
            else if(Math.pow(mid,2)<num){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;

    }
}
