package com.kh.practice.set;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name,int age, int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return  "name= " + name +
                ", age=" + age +
                ", height=" + height;
    }
}
