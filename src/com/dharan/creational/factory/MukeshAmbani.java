package com.dharan.creational.factory;

public class MukeshAmbani {
    public static void main(String[] args) {
        Car c = CarFactory.createCar("SW","DB","LR","basic");
        System.out.println(c);
        c = CarFactory.createCar("SW","DB","LR","sports");
        System.out.println(c);
    }
}
