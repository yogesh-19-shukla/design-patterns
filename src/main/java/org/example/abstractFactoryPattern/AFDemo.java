package org.example.abstractFactoryPattern;

import java.util.Scanner;

public class AFDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GUIFactory guiFactory = null;
        System.out.println("Select your OS - Windows/Mac");
        String os = sc.nextLine().trim().toLowerCase();

        switch (os) {
            case "windows":
                guiFactory = new WindowsFactory();
                break;
            case "mac":
                guiFactory = new MacFactory();
                break;
            default:
                System.out.println("Invalid OS: " + os);
                sc.close();
        }

        Button button = guiFactory.createButton();
        button.render();

        Checkbox checkbox = guiFactory.createCheckbox();
        checkbox.select();
        sc.close();
        
    }
}
