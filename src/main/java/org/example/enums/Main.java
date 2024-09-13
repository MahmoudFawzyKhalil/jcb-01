package org.example.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ENUMS (short for ENUMERATIONS)
        Person person = new Person("Mahmoud", Gender.MALE);
        System.out.println("person = " + person);

        System.out.println(Arrays.toString(Gender.values()));
        System.out.println(Gender.valueOf("MALE")); // must match the case (lowercase or uppercase) of your enum value

        // OPTIONALS
    }
}
