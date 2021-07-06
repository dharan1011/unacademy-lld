package com.dharan.structural.decorator;

public class CarShowRoom {
    public static void main(String[] args) {
//        Car basicCar = new BasicCar();
//        basicCar.manufactureCar();
//        Car electricCar = new ElectricCarDecorator(new BasicCar());
//        electricCar.manufactureCar();

        Car electricLuxuryCar = new ElectricCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        electricLuxuryCar.manufactureCar();
    }
}
