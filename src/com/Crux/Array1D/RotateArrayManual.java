package com.Crux.Array1D;

public class RotateArrayManual {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,4);

    }

    public static void rotate(int[] arr, int k) {
        k=k%arr.length;
        for(int i=0;i<k;i++){
            pass(arr);
            Display(arr,i);
        }
    }
    public static void pass(int[] arr){
        int i=arr.length-1;
        int temp = arr[arr.length-1];
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=temp;
    }


    public static void Display(int[] arr,int j) {
        System.out.println( "pass" + (j+1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
