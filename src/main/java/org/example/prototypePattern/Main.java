package org.example.prototypePattern;

public class Main {

    public static void main(String[] args) {
        Circle originalCircle = new Circle("Red", 5);
        Rectangle originalRectangle = new Rectangle("Blue", 4, 5);

        Circle cloneCircle = (Circle) originalCircle.clone();
        cloneCircle.setColour("Black");

        Rectangle cloneRectangle = (Rectangle) originalRectangle.clone();
        cloneRectangle.setColour("Orange");

        originalCircle.draw();
        originalRectangle.draw();

        cloneCircle.draw();
        cloneRectangle.draw();

        System.out.println("Circle same object? " + (originalCircle == cloneCircle));
        System.out.println("Rectangle same object? " + (originalRectangle == cloneRectangle));
    }
}
