package com.dharan.behavioral.strategy;

public class AmazonApp {
    public static void main(String[] args) {
        Product product = new Product("iphone-12",1999);
        AmazonKart kart = new AmazonKart(new PhonePe(), product);
        kart.checkout();
    }
}
