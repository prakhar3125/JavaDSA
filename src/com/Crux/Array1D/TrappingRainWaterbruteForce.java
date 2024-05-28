package com.Crux.Array1D;

public class TrappingRainWaterbruteForce {

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        rain(arr);

    }


    public static void rain(int[] arr){
        int[] brr = new int[arr.length];
        brr[0]=arr[0];
        brr[arr.length-1]=arr[arr.length-1];
        int i=1;
        while(i<arr.length-1){
            int j=i-1;
            int k=i+1;

            int rmax=0;
            int lmax=0;
            while(j>=0){
                if(arr[j]>lmax){
                    lmax=arr[j];
                }
                j--;
            }
            while(k<arr.length){
                if(arr[k]>rmax){
                    rmax=arr[k];
                }
                k++;
            }
            brr[i]=Math.min(lmax,rmax);
            i++;

        }
        Display(brr);
        System.out.println("");
        for(int l=1;l<arr.length-1;l++){
            brr[l]=brr[l]-arr[l];
        }
        int l=0;
        int sum=0;
        for(l=1;l<arr.length-1;l++){
            if(brr[l]>0){
                sum+=brr[l];
            }

        }

        System.out.println(sum);

    }

    public static void Display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


}
