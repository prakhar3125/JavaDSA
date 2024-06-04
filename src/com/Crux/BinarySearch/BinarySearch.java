package com.Crux.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,3));


    }

    public static int binarySearch(int[]arr , int key){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(key==arr[mid]){
                return mid;

            }
            else if(key<arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }


}
