package org.example.builderPattern;

public class Demo {

    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel I9", 64)
                .setGraphicsCard(true)
                .setGraphicsCard(true)
                .setWiFi(true)
                .build();

        Computer basicPC = new Computer.Builder("Intel I3", 8).build();

        System.out.println("GamingPC specs: ");
        gamingPC.showSpecs();

        System.out.println("BasicPC specs: ");
        basicPC.showSpecs();
    }
}
