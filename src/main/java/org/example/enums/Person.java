package org.example.enums;

public class Person {
    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // This is a change


    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", gender=" + gender +
               '}';
    }
}


