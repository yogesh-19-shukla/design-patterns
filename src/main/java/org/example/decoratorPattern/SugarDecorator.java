package org.example.decoratorPattern;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + " ,Sugar";
    }

    public double getPrice() {
        return super.getPrice() + 1.0;
    }
}
