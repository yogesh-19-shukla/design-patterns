package org.example.strategyPattern;

public class BikeStrategy implements NavigationStrategy {
    @Override
    public void navigate(String src, String dest) {
        System.out.println("Calculating shortest bike route from " + src + " to " + dest);

    }
}
