package com.Crux.ArrayList;
import java.util.*;

public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // empty list created in heap say at 2k location and address stored in main method in stack frame
        //list.add(element)
        list.add(20);//add element to array list
        list.add(30);
        System.out.println(list); // print list [20, 30]
        //kipping index and adding is not possible

        //list.add(index,element) // Range 0 to n
        list.add(1,25); // element 25 kept at index 1 , rest shifted to right by index
        System.out.println(list); //[20, 25, 30]

        //list.get(index) //get element at index
        System.out.println(list.get(2)); // Range 0 to n-1


        //list.remove(index)
        System.out.println(list.remove(1)); //25 removed
        System.out.println(list); //[20, 30]

        //list.set(index,element) // update at index
        list.set(1,21);
        System.out.println(list); //[20, 21]

        //list.size()
        System.out.println(list.size()); //size of list

        //Sort list
        Collections.sort(list);

        list.add(22);
        //Print list manually 
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");


        System.out.println("For Each loop");
        //for-each loop
        for(int num:list){
            System.out.print(num + " "); //20 21 22
        }
        //for(type varName : arrName)

        //Arraylist grow by 1.5X if more elements are added than capacity
        //ArrayList<Integer> list = new ArrayList<>(SIZE);
        ArrayList<Integer> list1 = new ArrayList<>(10); //new capacity 15 if 11th element added





    }
}
