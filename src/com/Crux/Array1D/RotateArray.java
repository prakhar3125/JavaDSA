
//k=k%arr.length for case when k > arr.length
package com.Crux.Array1D;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Display(arr);
        rotate(arr,3);
        System.out.println("");
        Display(arr);


    }
    public static void rotate(int[] arr, int k) {
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);


    }
    public static void reverse(int[] arr,int i,int j){

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }
    public static void swap(int[] arr,int i,int j){
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
