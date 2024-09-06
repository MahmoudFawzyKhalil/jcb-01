package org.example.staticfinal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //{"abc", "def", "123"}
        System.out.println("Arrays.toString(args) = " + Arrays.toString(args));

        Person.incrementNumberOfInstances();
        Person.incrementNumberOfInstances();
        Person.incrementNumberOfInstances();
        System.out.println(Person.numberOfInstances);

        String result = Utils.prefixWithUnderscore("Mahmoud");
        System.out.println("result = " + result);

//        String.join()
    }

}
