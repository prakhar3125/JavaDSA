package com.Crux.Recursion;

public class Power {
    public static int Pow(int a , int b){
        if(b==0){
            return 1;
        }
        return a * Pow(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(Pow(2,4));
    }
}
