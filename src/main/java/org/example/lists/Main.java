package org.example.lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[2];
//        names.length
        names[0] = "John";
        names[1] = "Jane";
        // Fixed size
        // A class that encapsulates an array, and gives it super powers

        // More efficient to add the expected size
        ArrayList<String> namesList = new ArrayList<>(100); // Type-safety feature: Generics
        // Adding an item to a list
        namesList.add("John");
        namesList.add("Jane");
//        namesList.add(1);
//        namesList.add(new Object());
//        Object first = namesList.getFirst();

        // Getting a list's size
        int size = namesList.size();
        System.out.println("namesList = " + namesList);
        System.out.println("size = " + size);

        namesList.remove("John");
        System.out.println("namesList = " + namesList);

//        namesList.remove(0);
        namesList.removeFirst();
        System.out.println("namesList = " + namesList);

        // Adding an element at a specific position
        namesList.add("Charlie 1");
        namesList.add("Charlie 2");
        namesList.add(1, "Bob");

        System.out.println("namesList = " + namesList);

        String firstElement  = namesList.get(0);
        System.out.println("firstElement = " + firstElement);

        // Iterating through the list, standard for i loop
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        // For each loop, we dont care about the index, we just want the element
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
