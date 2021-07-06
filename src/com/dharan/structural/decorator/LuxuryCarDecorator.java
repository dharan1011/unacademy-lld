package com.dharan.structural.decorator;

public class LuxuryCarDecorator extends BaseDecorator{
    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Adding Luxury Features");
    }
}
