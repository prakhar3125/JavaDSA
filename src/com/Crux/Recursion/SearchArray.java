package com.Crux.Recursion;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,1,7};
        int key = 34;
        System.out.println(search(arr,key,0));


    }
    public static int search(int[] arr , int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return search(arr,key,i+1);

    }

}
