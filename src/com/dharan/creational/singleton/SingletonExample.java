package com.dharan.creational.singleton;


public class SingletonExample {

    /**
     * 1) Make Constructor Private
     * */
    private SingletonExample(){

    }

    /**
     * 2) Responsibility of initialization of object should be handled by class itself
     * */

    // Eager Initialization
    private final static SingletonExample INSTANCE = new SingletonExample();

    /**
     * 3) Expose a public static method to fetch the single instance
     * */

    public static SingletonExample getInstance(){
        return INSTANCE;
    }
}
