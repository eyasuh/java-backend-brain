package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person p1 = new Person("Chala", "Chuba", 20, new Date());
        Person p2 = new Person("Abebe", "Bikila", 30, new Date());
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}

class Person {
    private String name;
    private String lastName;
    private int age;
    private Date lastModifiedDate;

    public Person(String name, String lastName, int age, Date lastModifiedDate) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person other = (Person) o;

        return this.age == other.age
                && Objects.equals(name, other.name)
                && Objects.equals(lastName, other.lastName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

}