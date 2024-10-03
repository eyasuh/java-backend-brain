package io.javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.List;

public class ListSwap {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);

        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        System.out.println(swap(list1,2,3));
    }


    public static List<Integer> swap(ArrayList<Integer> list, int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);

        return list;
    }
}
