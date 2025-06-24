package org.example.chainOfResponsibilityPattern;

public class DataValidateHandler extends Handler{
    @Override
    public void handle(Request request) {
        if (request.getUsername() == null || request.getUsername().trim().isEmpty()) {
            System.out.println("❌ Validation failed: Username is blank.");
            return;
        }
        System.out.println("✅ Data validation passed for " + request.getUsername());
        if (next != null) next.handle(request);
    }
}
