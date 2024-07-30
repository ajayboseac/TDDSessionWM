package com.walmart.problems;

import java.util.HashSet;
import java.util.Set;

public class FindTheBug1 {

    public static void main(String[] args) {
        Set<Person> people = new FindTheBug1().getPeople();
        System.out.println(people.size());
    }

    public Set<Person> getPeople() {
        Set<Person> people = new HashSet<>();

        Person person1 = new Person("Menaka", 30);
        Person person2 = new Person("Gridhar", 30);
        Person person3 = new Person("Gridhar", 25);
        Person person4 = new Person("Sanjay", 25);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        return people;
    }

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Incorrectly overrides equals method
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;

            Person person = (Person) obj;
            return name.equals(person.name); // Only comparing names, not age
        }

        @Override
        public int hashCode() {
            return name.hashCode(); // hashCode must match equals
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

}
