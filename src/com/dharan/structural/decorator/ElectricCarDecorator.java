package com.dharan.structural.decorator;

public class ElectricCarDecorator extends BaseDecorator{
    public ElectricCarDecorator(Car car) {
        super(car);
    }
    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Adding Electric Features");
    }
}
