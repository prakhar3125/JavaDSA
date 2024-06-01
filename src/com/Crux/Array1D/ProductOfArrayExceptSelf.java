package com.Crux.Array1D;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Display(arr);
        System.out.println("");
        product(arr);

    }
    public static void product(int[] arr){
        int[] lrr = new int[arr.length];
        int[] rrr = new int[arr.length];
        lrr[0]=1;
        rrr[arr.length-1]=1;
        int i=1;
        int j=arr.length-2;
        while(i<arr.length){
            lrr[i]=lrr[i-1]*arr[i-1];
            rrr[j]=rrr[  j+1]*arr[j+1];
            i++;
            j--;
        }
        int[] product = new int[arr.length];
        for(i=0;i<arr.length;i++){
            product[i]+=lrr[i]*rrr[i];
        }

        Display(product);

    }
    public static void Display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
