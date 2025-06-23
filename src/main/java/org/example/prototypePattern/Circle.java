package org.example.prototypePattern;

public class Circle extends Shape {

    private int radius;

    public Circle(String colour, int radius){
        super(colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle of colour " + getColour() + " with radius " + radius);

    }
}
