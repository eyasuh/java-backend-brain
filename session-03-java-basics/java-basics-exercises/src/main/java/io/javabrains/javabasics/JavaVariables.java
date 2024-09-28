package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int intNumber = 123;
        // long variable to store a long value
        long longNumber = 123L;
        // float variable to store a floating-point value
        float floatNumber = 123.456f;
        // double variable to store a double value
        double doubleNumber = 123.456;
        // char variable to store a single character
        char charNumber = 'a';
        // boolean variable to store a boolean value
        boolean booleanValue = true;
        // String variable to store a string of characters
        String stringValue = "hello";
        // Step 2: Print the values of the variables to the console
        System.out.printf("%d %d %f %f %n %c %b %s", intNumber,longNumber,floatNumber,doubleNumber,charNumber,booleanValue,stringValue);
        // Step 3: Modify the values of the variables and print the updated values
        System.out.printf("%n%d %d %f %f %n %c %b %s", intNumber + 5, longNumber * 4, floatNumber,doubleNumber,charNumber,booleanValue,stringValue);

    }
}
