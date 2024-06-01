package com.Crux.Array1D;
import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int n=arr.length;
        int k = findKRotation(arr,arr.length);
        System.out.println(k);


    }
    public static int findKRotation(int arr[], int n) {
        int[] brr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if (Arrays.equals(brr, arr)) {
                return 0;
            }
           int[] crr = rotate(brr,1);
            if (Arrays.equals(crr, arr)) {
                return (i+1);
            }



       }
        return -1;

    }



    public static int[] rotate(int[] arr,int k){
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        return arr;

    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
