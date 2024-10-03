package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1,3,5,7,9);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println(sum);
    }

}
