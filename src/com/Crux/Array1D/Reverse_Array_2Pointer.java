package com.Crux.Array1D;

public class Reverse_Array_2Pointer {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Display(arr);
        Reverse(arr);
        System.out.println();
        Display(arr);

    }

    public static void Reverse(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            Swap(arr,i,j);
            i++;
            j--;
        }

    }

    public static void Swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

