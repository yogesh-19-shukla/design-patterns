package org.example.chainOfResponsibilityPattern;

public class RoleHandler extends Handler{
    @Override
    public void handle(Request request) {
        if(!"admin".equalsIgnoreCase(request.getRole().toLowerCase())){
            System.out.println("❌ Access denied: User is not an admin.");
            return;
        }
        System.out.println("✅ Role check passed for " + request.getUsername());
        if(next!= null)  next.handle(request);
    }
}
