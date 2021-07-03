package com.dharan.behavioral.cor;

public class Person {
    private final String name;
    private final String skillType;

    public Person(String name, String skillType) {
        this.name = name;
        this.skillType = skillType;
    }

    public String getName() {
        return name;
    }

    public String getSkillType() {
        return skillType;
    }
}
