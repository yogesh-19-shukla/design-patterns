package org.example.prototypePattern;

public class Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(String colour, int width, int length) {
        super(colour);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    @Override
    public void draw() {
        System.out.println("Drawing Rectangle of colour " + getColour() + " with " + width + "x" + length);
    }
}
