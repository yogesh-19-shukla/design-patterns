package org.example.observerPattern;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("📩 " + name + " received notification: New video - " + videoTitle);
    }

    @Override
    public String toString() {
        return name;
    }
}
