package org.example.lombok;

import lombok.*;
import lombok.experimental.FieldNameConstants;

public class LombokExamples {
    public static void main(String[] args) {
        Person person = new Person("Mahmoud", "Tuesday");
//        person.setName("John");
//        person.setFavoriteDayOfWeek("Monday");
        System.out.println("person = " + person);

        Address address = new Address("123", "456", "Cairo");
        // The best I can do to change the address is to create a COPY of the address with one field changed
        Address newAddress = address.withCity("Hamburg");
        System.out.println(System.identityHashCode(address));
        System.out.println(System.identityHashCode(newAddress));

        Person.PersonBuilder builder = Person.builder();
        Person builtPerson = builder
                .age(1)
                .name("Bob")
                .build();
        System.out.println("builtPerson = " + builtPerson);

        String age = Person.Fields.age;
        System.out.println(age);
    }
}

@ToString
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
@Builder
@FieldNameConstants
class Person {
    private final String name;
    private final String favoriteDayOfWeek;
    private int age;
    // We have 50 fields
}

@Data
@With
class Address {
    final String street;
    final String buildingNumber;
    final String city;
}

record AddressRecord(String street, String buildingNumber, String city) {}