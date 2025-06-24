package org.example.strategyPattern;

public class Navigator {
    private NavigationStrategy strategy;

    public Navigator(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String src, String dest){
        if(strategy == null){
            throw new IllegalArgumentException("Strategy cannot be null!!");
        }
        strategy.navigate(src, dest);
    }
}
