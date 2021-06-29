package com.dharan.factory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendered Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Windows Button");
    }
}
