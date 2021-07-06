package com.dharan.structural.decorator;

public class BaseDecorator implements Car {
    protected Car car;

    public BaseDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void manufactureCar() {
        this.car.manufactureCar();
    }
}
