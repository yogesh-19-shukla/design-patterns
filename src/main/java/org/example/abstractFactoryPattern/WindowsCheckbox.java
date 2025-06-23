package org.example.abstractFactoryPattern;

public class WindowsCheckbox implements Checkbox{

    @Override
    public void select() {
        System.out.println("Selecting Windows checkbox!!");
    }
}
