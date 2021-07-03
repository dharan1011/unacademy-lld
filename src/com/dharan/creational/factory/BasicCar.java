package com.dharan.creational.factory;

public class BasicCar implements Car {

    private final String steering;
    private final String brakes;
    private final String mirror;

    public BasicCar(String steering, String brakes, String mirror) {
        this.steering = steering;
        this.brakes = brakes;
        this.mirror = mirror;
        System.out.println("Creating a basic car");
    }

    @Override
    public String getSteering() {
        return this.steering;
    }

    @Override
    public String getBrakes() {
        return this.brakes;
    }

    @Override
    public String getMirror() {
        return this.mirror;
    }
}
