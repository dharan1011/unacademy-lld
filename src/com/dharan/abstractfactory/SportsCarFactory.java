package com.dharan.abstractfactory;

public class SportsCarFactory implements CarAbstractFactory {

    private final String steering;
    private final String brakes;
    private final String mirror;

    public SportsCarFactory(String steering, String brakes, String mirror) {
        this.steering = steering;
        this.brakes = brakes;
        this.mirror = mirror;
    }

    @Override
    public Car createCar() {
        return new SportsCar(steering, brakes, mirror);
    }
}
