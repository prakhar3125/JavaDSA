package com.Crux.String;

public class fixedLengthSubstring {
    public static void main(String[] args) {
        String str = "abcde";
        print(str);

    }
    public static void print(String str){
        int i=0;
        int k=1;

        while(k<=str.length()){
            i=0;
            while(i+k<=str.length()){
                int j = i+k;
                System.out.println(str.substring(i,j));
                i++;
            }

            k++;
        }
    }
}
