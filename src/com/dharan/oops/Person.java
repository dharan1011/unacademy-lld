package com.dharan.oops;

import java.io.IOException;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) { // Called while creating the Object
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private Integer eat(int a) throws IndexOutOfBoundsException {
        return 1;
    }

    public String eat(String a) {
        return "";
    }

    public void sleep(){

    }

    public void walk(){

    }
}

//
