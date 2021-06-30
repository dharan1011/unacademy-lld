package com.dharan.abstractfactory;

public class MukeshAmbani {
    public static void main(String[] args) {
        Car c1 = CarFactory.create(new BasicCarFactory("WB","LR","LR"));
        Car c2 = CarFactory.create(new SportsCarFactory("WB","LR","LR"));
    }
}
