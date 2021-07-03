package com.dharan.creational.builder;

public class MangoMan {
    public static void main(String[] args) {
        Car c1 = new Car.CarBuilder("V8","Alloy", "L").build();
        System.out.println(c1);
        Car c2 = new Car.CarBuilder("VDi","Normal","R")
                .setSunRoof("YES")
                .setLeatherSeats(true)
                .build();
        System.out.println(c2);
    }
}
