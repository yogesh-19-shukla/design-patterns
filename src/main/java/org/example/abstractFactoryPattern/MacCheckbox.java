package org.example.abstractFactoryPattern;

public class MacCheckbox implements Checkbox{

    @Override
    public void select() {
        System.out.println("Selecting Mac checkbox!!");
    }
}
