package org.example.interfaces;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Comparable youngPerson = new Person(18, "Mahmoud");
        Comparable olderPerson = new Person(20, "Ali");
        int result = youngPerson.compareTo(olderPerson);
        System.out.println("result = " + result);

        printAgeMessage(youngPerson, olderPerson);
    }

    public static void printAgeMessage(Comparable a, Comparable b) {
        if (a.compareTo(b) < 0) {
            System.out.println(a + " is younger than " + b);
        } else if (a.compareTo(b) > 0) {
            System.out.println(a + " is older than " + b);
        } else {
            System.out.println(a + " has the same age as " + b);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
               "age=" + age +
               ", name='" + name + '\'' +
               '}';
    }

    @Override
    public int compareTo(Person that) {
        // -1 if this < that
        // 0 if this == that
        // 1 if this > that
        if (this.age < that.age) {
            return -1;
        }
        if (this.age > that.age) {
            return 1;
        }
        return 0;
    }
}
