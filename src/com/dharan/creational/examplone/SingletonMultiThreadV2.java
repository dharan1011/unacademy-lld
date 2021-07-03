package com.dharan.creational.examplone;

public class SingletonMultiThreadV2 {

    private final static Object lock = new Object();
    private SingletonMultiThreadV2(){}

    private static SingletonMultiThreadV2 INSTANCE;

    private static SingletonMultiThreadV2 getInstance(){
        if(INSTANCE == null){
            synchronized (lock){
                if(INSTANCE == null){
                    INSTANCE = new SingletonMultiThreadV2();
                }
            }
        }
        return INSTANCE;
    }
}
