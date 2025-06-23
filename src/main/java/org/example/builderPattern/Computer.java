package org.example.builderPattern;

public class Computer {

    // Required Params
    public final String cpu;
    public final int ram;

    // Optional Params
    private final int storage;
    private final boolean hasGraphicsCard;
    private final boolean hasWiFi;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWiFi = builder.hasWiFi;

    }

    public static class Builder {
        // Required
        private final String cpu;
        private final int ram;

        // Optional - default values
        private int storage = 256;
        private boolean hasGraphicsCard = false;
        private boolean hasWiFi = false;

        public Builder(String cpu, int ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void showSpecs(){
        System.out.println("🖥️ CPU: " + cpu);
        System.out.println("💾 RAM: " + ram + "GB");
        System.out.println("📦 Storage: " + storage + "GB");
        System.out.println("🎮 Graphics Card: " + (hasGraphicsCard ? "Yes" : "No"));
        System.out.println("📶 WiFi: " + (hasWiFi ? "Yes" : "No"));
    }
}
