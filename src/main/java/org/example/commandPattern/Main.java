package org.example.commandPattern;

public class Main {

    public static void main(String[] args) {
        Remote remote = new Remote();
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Turn ON
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        // Turn OFF
        remote.setCommand(lightOff);
        remote.pressButton();
        remote.pressUndo();
    }
}
