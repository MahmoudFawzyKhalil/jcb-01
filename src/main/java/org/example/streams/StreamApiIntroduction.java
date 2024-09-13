package org.example.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamApiIntroduction {
    public static void mainOld(String[] args) {
        List<String> names = List.of("Mahmoud", "Bob", "Michael");
        Stream<String> stream = names.stream();
        Stream<String> filtered = stream.filter(name -> name.startsWith("M"));
        // Any method on stream which returns a stream is an intermediate operation,
        // the stream does not do any work yet, it just adds the operation to its collection of operations
        System.out.println("filtered = " + filtered);

        Stream<String> filteredTwice = filtered.filter(name -> name.endsWith("ichael"));

        // For the stream to do work, we must call a terminal operation, then the stream does work
        filteredTwice.forEach(name -> System.out.println(name));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Mahmoud", "Bob", "Michael");
        names.stream()
                .filter(name -> name.startsWith("M"))
                .filter(name -> name.endsWith("ichael"))
                .forEach(name -> System.out.println(name));
    }
}
