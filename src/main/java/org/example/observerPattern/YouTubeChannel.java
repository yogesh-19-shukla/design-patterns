package org.example.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    private List<Observer> subscribers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println(observer + " subscribed to " + channelName);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println(observer + " unsubscribed from " + channelName);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        System.out.println("\n📢 " + channelName + " uploaded: " + videoTitle);
        for (Observer o : subscribers){
            o.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        notifySubscribers(videoTitle);
    }
}
