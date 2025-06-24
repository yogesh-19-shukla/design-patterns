package org.example.observerPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel techChannel = new YouTubeChannel("TechWithYogesh");

        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        techChannel.subscribe(alice);
        techChannel.subscribe(bob);

        techChannel.uploadVideo("Observer Pattern Explained");

        techChannel.subscribe(charlie);

        techChannel.uploadVideo("Java Design Patterns Deep Dive");

        techChannel.unsubscribe(bob);

        techChannel.uploadVideo("Spring Boot with Kafka");
    }
}
