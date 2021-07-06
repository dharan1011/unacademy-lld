package com.dharan.behavioral.strategy;

public class AmazonKart {
    private final WalletStrategy walletStrategy;
    private final Product product;

    public AmazonKart(WalletStrategy walletStrategy, Product product) {
        this.walletStrategy = walletStrategy;
        this.product = product;
    }

    public void checkout(){
        walletStrategy.payment(product.getCost());
    }
}
