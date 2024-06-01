package com.Crux.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr);

    }


    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k=j;

                }
            }
            swap(arr,i,k);
            display(arr);

        }
    }


    public static void swap(int[] arr,int i,int k){
        int temp = arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
