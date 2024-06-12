package com.Crux.SlidingWindow;

public class LongestPerfectSubstring {
    public static void main(String[] args) {
        String str = "abba";
        int flipa = maxCount(str,2,'a');
        int flipb = maxCount(str,2,'b');
        System.out.println(Math.max(flipa,flipb));
    }
    public static int maxCount(String str , int k , char c){
        int l=0;
        int r=0;
        int flip=0;
        int ans=0;
        while(r<str.length()){
            if(str.charAt(r)==c){
                flip++;
            }
            //shrink
            while(flip>k){
                if(str.charAt(l)==c){
                    flip--;
                }
                l++;
            }
            //ans calculation
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }


}
