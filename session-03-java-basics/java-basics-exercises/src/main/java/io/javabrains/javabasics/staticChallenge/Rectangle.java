package io.javabrains.javabasics.staticChallenge;

public class Rectangle {
    private int width;
    private int height;
    private static int numOfRectangles = 0;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        numOfRectangles++;
    }
    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    public int getNumOfRectangles() {
        return numOfRectangles;
    }
}
