package org.example.strategyPattern;

public class WalkStrategy implements NavigationStrategy {
    @Override
    public void navigate(String src, String dest) {
        System.out.println("Calculating pedestrian-friendly route from " + src + " to " + dest);
    }
}
