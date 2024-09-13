package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    // Java Streams
    // Lambdas
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mahmoud");
        names.add("Bob");
        names.add(null);

        List<String> result = filterList(names, new FilterThatRemovesPeopleNamedMahmoud());
        System.out.println("result = " + result);

        // Anonymous inner class, inline
        Filter filterThatRemovesBob = new Filter() {
            @Override
            public boolean matches(String string) {
                return !"Bob".equalsIgnoreCase(string); //  advantage is that if string is null, we never get a null pointer exception
            }
        };
        List<String> result2 = filterList(names, filterThatRemovesBob);
        System.out.println("result2 = " + result2);

        // Lambda expressions
        Filter lambdaFilterThatRemovesBob = (String string) -> {
            System.out.println("Multi line lambda");
            return !"Bob".equalsIgnoreCase(string);
        };

        Filter lambdaFilterThatRemovesBob2 = string -> !"Bob".equalsIgnoreCase(string);

        List<String> withoutNulls = filterList(names, string -> string != null);
        System.out.println("withoutNulls = " + withoutNulls);
    }


    public static List<String> filterList(List<String> strings, Filter filter) {
        // Apply the filter to the list
        // And return only the elements that match the filter
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (filter.matches(string)) {
                result.add(string);
            }
        }
        return result;
    }
}

@FunctionalInterface // This annotation lets the compiler help you write correct functional interfaces
interface Filter {
    // A single method declared in it
    boolean matches(String string);

//    boolean anotherMethod(String string);
}

class FilterThatRemovesPeopleNamedMahmoud implements Filter {

    @Override
    public boolean matches(String string) {
        return !"Mahmoud".equalsIgnoreCase(string);
    }
}