package org.example.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.add(new Person(1L, "Mahmoud"));
        personDatabase.add(new Person(2L, "Bob"));
        personDatabase.add(new Person(3L, "John"));

        long id = 1002L;
        Optional<Person> personOptional = personDatabase.get(id); // ID does not exist
        Person person = personOptional.orElse(new Person(0L, "UNKNOWN"));
        System.out.println("Retrieved person with name: " + person.getName());

        Optional<String> stringOptional = Optional.empty();

        String actualString = stringOptional.orElse("UNKNOWN");
        System.out.println("actualString = " + actualString);
    }
}
