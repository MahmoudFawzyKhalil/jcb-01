package org.example.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainPolymorphism {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names = new LinkedList<>();

        // Factory method
        List<String> list = List.of("Some item", "another item");
        // Fixed list of these items

        list.remove(0);

//        list.contains() // CTRL + SPACE
    }

    // always just use the interface, your code will be better without you even knowing it
    public static List<String> getNames(List<String> someOtherList) {
        List<String> names = new LinkedList<>();
        names.add("Bob");
        return names;
    }
}
