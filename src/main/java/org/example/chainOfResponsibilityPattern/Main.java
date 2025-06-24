package org.example.chainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        // Create chain: Auth → Role → Validation
        Handler chain = new AuthHandler();
        chain.setNext(new RoleHandler()).setNext(new DataValidateHandler());

        Request r1 = new Request("Yogesh", "admin", true);
        System.out.println("---- Test 1: Valid Admin ----");
        chain.handle(r1);

        Request r2 = new Request("Alice", "admin", false);
        System.out.println("\n---- Test 2: Not Logged In ----");
        chain.handle(r2);

        Request r3 = new Request("Bob", "user", true);
        System.out.println("\n---- Test 3: Not Admin ----");
        chain.handle(r3);

        Request r4 = new Request("   ", "admin", true);
        System.out.println("\n---- Test 4: Blank Username ----");
        chain.handle(r4);
    }
}
