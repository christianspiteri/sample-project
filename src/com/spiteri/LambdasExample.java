package com.spiteri;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("Christian","Spiteri");
        Person p2 = new Person("Joseph", "Spiteri");
        Person p3 = new Person("James", "Smith");

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        persons.stream()
                .forEach(person -> System.out.println(person));
        persons.stream()
                .forEach(System.out::println);
        persons.stream()
                .filter(person -> person.getLastName().equals("Smith"))
                .forEach(System.out::println);
    }
}
