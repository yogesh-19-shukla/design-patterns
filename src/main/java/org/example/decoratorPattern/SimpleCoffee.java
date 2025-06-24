package org.example.decoratorPattern;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Here is your simple coffee";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
