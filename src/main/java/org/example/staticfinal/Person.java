package org.example.staticfinal;

public class Person {
    // static, final

    private final String name; // instance field
    public static /*final*/ int numberOfInstances = 123; // static field

    public Person(String name) {
        this.name = name;
        Person.incrementNumberOfInstances();
    }

    public Person() {
        this.name = "Default name";
    }

    public static void incrementNumberOfInstances() {
//        System.out.println("name = " + name);
//        static methods don't have access to instance fields (or the this keyword)
//        numberOfInstances++;
        numberOfInstances = numberOfInstances + 1; // 124
    }

    public final String getName() { // We cannot override getName
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               '}';
    }

    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("John");
//        System.out.println("person = " + person);
        Person person1 = new Person("James");
        Person person2 = new Person("Bob");
        Person x = new Person("X");
        System.out.println("x = " + x);
        System.out.println(Person.numberOfInstances);
    }
}
