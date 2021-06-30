package com.dharan.factory;

public class CarFactory {

    /**
     * Create a car
     * @param steering
     * @param brakes
     * @param mirrors
     * @param type
     * @return Car
     */
    public static Car createCar(String steering, String brakes, String mirrors, String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicCar(steering, brakes, mirrors);
        }else if (type.equalsIgnoreCase("sports")){
            return new SportsCar(steering, brakes, mirrors);
        }
        throw new RuntimeException("No such car supported : " + type);
    }
}
