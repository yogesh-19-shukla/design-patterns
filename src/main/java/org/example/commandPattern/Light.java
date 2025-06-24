package org.example.commandPattern;

public class Light {

    private boolean isOn = false;

    public void turnOn(){
        isOn = true;
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned OFF");
    }
}
