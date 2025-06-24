package org.example.decoratorPattern;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + " ,Milk";
    }

    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
