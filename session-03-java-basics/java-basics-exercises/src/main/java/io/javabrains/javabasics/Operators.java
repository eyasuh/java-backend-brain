package io.javabrains.javabasics;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int num1 = 12;
        int num2 = 21;
        // Step 2: Perform arithmetic operations
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 * num2;
        // Step 3: Print the results of the arithmetic operations
        System.out.println("num3 = " + num3);

        // Step 4: Perform increment and decrement operations
        int num6 = num1++;
        int num7 = num1--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        // Step 6: Perform comparison operations
        boolean bool = num1 > num2;

        // Step 7: Print the results of the comparison operations
        System.out.println("bool = " + bool);

        // Step 8: Perform logical operations
        boolean bool1 = true || false;

        // Step 9: Print the results of the logical operations
        System.out.println("bool1 = " + bool1);

    }
}
