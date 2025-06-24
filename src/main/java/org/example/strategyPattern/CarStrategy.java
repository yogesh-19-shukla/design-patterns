package org.example.strategyPattern;

public class CarStrategy implements NavigationStrategy{
    @Override
    public void navigate(String src, String dest) {
        System.out.println("Calculating fastest road route from " + src + " to " + dest);
    }
}
