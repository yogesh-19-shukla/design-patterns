package org.example.factoryPattern;

public class NotificationFactory {

    public Notification createNotification(String channel){
        if(channel==null || channel.isEmpty()) {
            throw new IllegalArgumentException("Notification channel cannot be null or empty");
        }

        return switch (channel.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Notification channel is invalid: " + channel);
        };
    }
}
