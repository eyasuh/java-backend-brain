package io.javabrains.javabasics.staticChallenge;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        Rectangle rectangle2 = new Rectangle(4, 6);
        Rectangle rectangle3 = new Rectangle(3, 4);

        System.out.printf("Area : %d    Perimeter : %d ", rectangle.getArea(), rectangle.getPerimeter());
        System.out.printf("%nArea : %d    Perimeter : %d ", rectangle2.getArea(), rectangle2.getPerimeter());
        System.out.printf("%nArea : %d    Perimeter : %d %n", rectangle3.getArea(), rectangle3.getPerimeter());
        System.out.println(rectangle.getNumOfRectangles());
    }
}

