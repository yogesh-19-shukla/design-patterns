package org.example.chainOfResponsibilityPattern;

public abstract class Handler {

    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(Request request);
}
