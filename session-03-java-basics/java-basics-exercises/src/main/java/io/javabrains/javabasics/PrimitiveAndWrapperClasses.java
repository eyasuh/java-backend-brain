package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int intNUm = 5;
        double doubleNum = 6;
        // Step 2: Convert primitive variables to wrapper objects
        Integer integerNum = Integer.valueOf(intNUm);
        Double doubleNum2 = doubleNum;
        // Step 3: Print the values of the wrapper objects
        System.out.println(integerNum.toString() + " " + doubleNum2);
        // Step 4: Convert wrapper objects back to primitive variables
        int backToIntNUm = integerNum.intValue();
        // Step 5: Print the values of the primitive variables
        System.out.println(backToIntNUm);
    }
}
