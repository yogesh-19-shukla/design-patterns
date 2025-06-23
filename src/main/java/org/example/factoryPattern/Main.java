package org.example.factoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotificationFactory factory = new NotificationFactory();
        System.out.println("Enter the notification type - sms/push/email");
        String input = sc.nextLine();
        try {
            Notification notification = factory.createNotification(input);
            notification.notifyUser();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}