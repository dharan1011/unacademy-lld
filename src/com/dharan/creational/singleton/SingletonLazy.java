package com.dharan.creational.singleton;

public class SingletonLazy {

    private SingletonLazy(){
    }

    // Lazy/On Demand Initialization
    private static SingletonLazy INSTANCE = null;


    public static SingletonLazy getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}
