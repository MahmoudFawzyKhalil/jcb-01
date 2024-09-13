package org.example.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonDatabase {
    private final Map<Long, Person> people = new HashMap<>();

    public void add(Person person) {
        people.put(person.getId(), person);
    }

    public Optional<Person> get(Long id) { // IT will either return a PERSON, or NULL, so please handle the nulls!!
        Person person = people.get(id);
        Optional<Person> personOptional = Optional.ofNullable(person);
        return personOptional;
    }
}
