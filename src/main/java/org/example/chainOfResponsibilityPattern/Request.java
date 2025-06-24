package org.example.chainOfResponsibilityPattern;

public class Request {

    private String username;
    private String role;
    private boolean loggedIn;

    public Request(String username, String role, boolean loggedIn) {
        this.username = username;
        this.role = role;
        this.loggedIn = loggedIn;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
