package com.dharan.behavioral.strategy;

public class GooglePay implements WalletStrategy{
    @Override
    public void payment(int amount) {
        System.out.println("Paying by GPay. Amount : " + amount);
    }
}
