package com.walmart.problems;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class FindTheBug2 {

    public static void main(String[] args) {
        Map<Person,MoreDetails> people = new HashMap<>();

        Person person1 = new Person("John",19,"Coimbatore");
        Person person2 = new Person("Doe", 20,"Coimbatore");
        Person person3 = new Person("Mary", 21,"Coimbatore");
        people.put(person1, new MoreDetails("smart","witty"));
        people.put(person2,new MoreDetails("brilliant","outgoing"));
        people.put(person3,new MoreDetails("studious"));
        person3.setCity("Bangalore");
        System.out.println(people.get(person1));
        System.out.println(people.get(person2));
        System.out.println(people.get(person3));
    }

}


class MoreDetails{

    String[] attributes;

    MoreDetails(String... attributes){
        this.attributes = attributes;
    }

}

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age,String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void setCity(String city){
        this.city = city;
    }

    // Incorrectly overrides equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Person person = (Person) obj;
        return name.equals(person.name) && new Integer(age).equals(person.age) && city.equals(person.city) ; // Only comparing names, not age
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,city); // hashCode must match equals
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age +", city"+city +" }";
    }
}
