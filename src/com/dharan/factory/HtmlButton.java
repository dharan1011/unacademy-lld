package com.dharan.factory;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendered Html Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Html Button");
    }
}
