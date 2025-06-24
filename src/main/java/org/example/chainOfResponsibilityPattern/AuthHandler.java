package org.example.chainOfResponsibilityPattern;

public class AuthHandler extends Handler{
    @Override
    public void handle(Request request) {
        if (!request.isLoggedIn()) {
            System.out.println("❌ Auth failed: User not logged in.");
            return;
        }
        System.out.println("✅ Auth passed for " + request.getUsername());
        if (next != null) next.handle(request);
    }
}
