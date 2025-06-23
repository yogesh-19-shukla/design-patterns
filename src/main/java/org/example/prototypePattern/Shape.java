package org.example.prototypePattern;

public abstract class Shape implements Cloneable {

    private String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract void draw();

    @Override
    public Shape clone(){
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported!!");
        }
    }

}
