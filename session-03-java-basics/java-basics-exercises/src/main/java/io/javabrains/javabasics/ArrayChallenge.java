package io.javabrains.javabasics;
import java.util.*;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int [] numArray = {1,3,2,4};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = Arrays.stream(numArray).sum();
        double average = Arrays.stream(numArray).average().getAsDouble();
        int largest = Arrays.stream(numArray).max().getAsInt();

        System.out.println(
                        "Sum = " + sum + "\n" +
                        "Average = " + average + "\n" +
                        "Largest = " + largest
        );

    }
}
