package com.Crux.Array1D;
import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        inverse(arr);



    }

    public static void inverse(int[] arr){
        int[] brr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            brr[temp] = i;
        }
        Display(brr);

    }
    public static void Display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
