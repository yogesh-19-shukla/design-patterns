package org.example.decoratorPattern;

public class Main {
    public static void main(String[] args) {
        // 1. Simple Coffee
        Coffee simple = new SimpleCoffee();
        printOrder("Simple Coffee", simple);

        // 2. Coffee + Milk
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        printOrder("Coffee with Milk", milkCoffee);

        // 3. Coffee + Milk + Sugar
        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        printOrder("Coffee with Milk & Sugar", milkSugarCoffee);

        // 4. Coffee + Milk + Sugar + Whipped Cream
        Coffee fullLoadedCoffee = new WhippedCreamDecorator(
                new SugarDecorator(
                        new MilkDecorator(
                                new SimpleCoffee())));
        printOrder("Fully Loaded Coffee", fullLoadedCoffee);

        // 5. Coffee + Sugar + Whipped Cream
        Coffee sugarCreamCoffee = new WhippedCreamDecorator(
                new SugarDecorator(
                        new SimpleCoffee()));
        printOrder("Coffee with Sugar & Cream", sugarCreamCoffee);
    }

    private static void printOrder(String title, Coffee coffee) {
        System.out.println("=== " + title + " ===");
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: ₹" + coffee.getPrice());
        System.out.println();
    }
}

