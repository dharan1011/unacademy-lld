package com.dharan.abstractfactory;

public class BasicCarFactory implements CarAbstractFactory{
    private final String steering;
    private final String brakes;
    private final String mirror;

    public BasicCarFactory(String steering, String brakes, String mirror) {
        this.steering = steering;
        this.brakes = brakes;
        this.mirror = mirror;
    }

    @Override
    public Car createCar() {
        return new BasicCar(steering, brakes, mirror);
    }
}
