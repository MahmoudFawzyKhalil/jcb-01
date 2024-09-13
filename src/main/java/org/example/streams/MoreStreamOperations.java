package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreStreamOperations {
    public static void main(String[] args) {
        List<String> names = List.of("Mahmoud", "Mark", "Bob", "Michaels");

//        Set.of("Bob").stream()

        System.out.println("\nDISTINCT");
        names.stream()
                .distinct()
                .forEach(name -> System.out.println(name));

        System.out.println("\nLIMIT");
        Stream<String> stream = names.stream();
        stream
                .limit(2)
                .forEach(name -> System.out.println(name));

        // Never reuse streams
        //        stream
        //                .forEach(name -> System.out.println(name));

        System.out.println("\nMAP");
        names.stream()
                .filter(name -> name.startsWith("M"))
                .map(name -> name.toUpperCase())
                .limit(1)
                .forEach(name -> System.out.println(name));

        System.out.println("\nOPTIONAL");
        names.stream()
                .map(name -> Optional.ofNullable(name))
                .forEach(name -> System.out.println(name));

        System.out.println("\nSORTED");
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));

        System.out.println("\nFLAT MAP");
        names.stream()
//                .map(name -> name.toCharArray())// Instead of Stream<char[]> I want Stream<char>
                .flatMap(name -> {
                    String[] split = name.split("");
                    return Arrays.stream(split);
                })
                .forEach(character -> System.out.println(character));

        System.out.println("\nTERMINAL OPERATIONS");
        System.out.println("\nTO LIST");
        List<String> filteredList = names.stream()
                .filter(name -> name.startsWith("M"))
                .toList(); // Terminal operation
        System.out.println(filteredList);

        System.out.println("\nTO COLLECTION");
        Set<String> set = names.stream()
//                .collect(Collectors.toCollection(() -> new HashSet<>()));
                .collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("\nTO MAP");
        Map<Integer, String> map = names.stream()
                .collect(Collectors.toMap(name -> name.length(), name -> name));
        System.out.println("collect = " + map);

        System.out.println("\nREDUCE");
        List<Integer> numbers = List.of(1, 2, 3);// Sum = 6
        List<Integer> empty = List.of();// Sum = 0

        Integer sum = numbers.stream()
                .reduce(10, (i1, i2) -> i1 + i2);
        System.out.println("sum = " + sum);

    }
}
