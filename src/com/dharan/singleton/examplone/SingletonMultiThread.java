package com.dharan.singleton.examplone;

public class SingletonMultiThread {

    private SingletonMultiThread(){

    }

    private static SingletonMultiThread INSTANCE = null;

    public static synchronized SingletonMultiThread getInstance(){
        if (INSTANCE == null)
            INSTANCE = new SingletonMultiThread();
        return INSTANCE;
    }

}
