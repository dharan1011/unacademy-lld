package com.dharan.abstractfactory;

public class CarFactory {
    static public Car create(CarAbstractFactory factory){
        return factory.createCar();
    }
}
