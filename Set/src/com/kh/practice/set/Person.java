package com.kh.practice.set;

import java.util.Objects;

public class Person {
    private String name;    // 이름
    private int age;        // 나이
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height;
    }

    // 모든 필드의 값이 일치하면 동일한 객체로 판단 : equals, hashCode
    // Person객체A.equals(Person 객체) 이런식으로 호출되어 사용될 것임!
    @Override
    public boolean equals(Object obj) {
        // 현재 객체와 전달받은 객체의 각 필드값을 비교해 모두 일치하면 true,아니면 false
        // Person    Object
        if(obj instanceof Person){
            Person p = (Person) obj;
            if (this.name.equals(p.name) && this.age == p.age && this.height == p.height){
                return true;
            }
        }
        //비교 대상인 o 객체가 Person 타입이 아니거나,
        // 3개의 필드 중 하나라도 값이 다른 경우 false 리턴
        return false;
    }
    @Override
    public int hashCode() {
        String info = name + age + height;
        return info.hashCode();
    }
}
