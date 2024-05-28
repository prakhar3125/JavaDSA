package com.Crux.Array1D;

public class Reverse_Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Display(arr);
        for(int i=0;i<arr.length/2;i++){
            Swap(arr,i,arr.length-i-1);
        }
        System.out.println();
        Display(arr);
    }


    public static void Swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void Display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
