package com.Crux.Array1D;
import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdef",'d'));

    }
    public static String reversePrefix(String str, char c) {
        String s = "";
        int i=0;
        int j=0;
        while(i<str.length()){
            if(str.charAt(i)==c){
                break;
            }
            i++;
        }
        int k=i+1;
        while(i>=0){
            s+=str.charAt(i);
            i--;
        }
        while(k<str.length()){
            s+=str.charAt(k);
            k++;
        }
        return s;



    }
}





