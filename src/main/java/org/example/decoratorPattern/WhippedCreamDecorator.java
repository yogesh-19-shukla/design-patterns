package org.example.decoratorPattern;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + " ,Whipped Cream";
    }

    public double getPrice() {
        return super.getPrice() + 7.0;
    }
}
