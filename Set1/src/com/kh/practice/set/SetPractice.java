package com.kh.practice.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
    public static void main(String[] args) {
        HashSet hSet1 = new HashSet();
        hSet1.add("김인창님 안녕하세요");
        hSet1.add(new String("김인창님 안녕하세요."));
        hSet1.add(new String("여러분"));
        hSet1.add(new String("짜잔"));
        hSet1.add(new String("깜짝놀랐지?"));
        System.out.println(hSet1);

        HashSet<Person> hSet2 = new HashSet();
        hSet2.add(new Person("김인창",30,167));
        hSet2.add(new Person("홍진호",40,170));
        hSet2.add(new Person("어윤수",32,175));
        hSet2.add(new Person("정명훈",33,180));


        for (Person p : hSet2){
            System.out.println(p);
        }
        System.out.println("----------------------------");
        Iterator<Person> it = hSet2.iterator();
        while (it.hasNext()){
            Person p =it.next();
            System.out.println(p);
        }
    }
}
