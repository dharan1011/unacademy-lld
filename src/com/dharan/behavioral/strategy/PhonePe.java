package com.dharan.behavioral.strategy;

public class PhonePe implements WalletStrategy{
    @Override
    public void payment(int amount) {
        System.out.println("Paying by PhonePe. Amount : " + amount);
    }
}
