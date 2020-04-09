package com.company.lecture17;

import java.util.*;

public class Mission5 {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Java", 30);
        Person person2 = new Person("Chak", "Noris", 50);
        Person person3 = new Person("50", "Cent", 45);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        String res = list.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.first_name!=null && person.last_name!=null && (person.first_name.length() + person.last_name.length())<15)
                .max (Comparator.comparingInt(a -> a.age)).map(person -> person.first_name + " " + person.last_name).orElse("");
        System.out.println(res);
    }
}
class Person {
    protected String first_name;
    protected String last_name;
    protected int age;

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}