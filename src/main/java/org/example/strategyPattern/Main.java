package org.example.strategyPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source:");
        String source = sc.nextLine();
        System.out.println("Enter destination:");
        String destination = sc.nextLine();

        System.out.println("Choose mode: car, walk, bike");
        String mode = sc.nextLine().trim().toLowerCase();

        switch (mode) {
            case "car":
                navigator = new Navigator(new CarStrategy());
                break;
            case "walk":
                navigator = new Navigator(new WalkStrategy());
                break;
            case "bike":
                navigator = new Navigator(new BikeStrategy());
                break;
            default:
                System.out.println("Invalid Navigation Strategy!!");
                sc.close();
        }

        navigator.navigate(source, destination);
        sc.close();
    }
}
