package org.example.observerPattern;

public interface Subject {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String videoTitle);
}
