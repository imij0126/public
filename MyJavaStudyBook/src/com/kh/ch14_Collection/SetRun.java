package com.kh.ch14_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class SetRun {
    /*/
        set : 순서가 없고, 중복도 허용되지 않음
        * 중복 체크 ? equals(), hashcode()을 통해 중복 데이터가 체크됨
     */
    public static void main(String[] args) {
        HashSet<Student> hSet = new HashSet<>();
        // 데이터 추가 : add(E e)
        hSet.add(new Student("기다운", 70));
        hSet.add(new Student("최종군",40));
        hSet.add(new Student("기다운",100));
        System.out.println(hSet);
        for (Student h : hSet){
            System.out.println(h);
        }
        System.out.println("=======================================");
        Iterator<Student> it = hSet.iterator();
        for(;it.hasNext();){               // 데이터가 존재하는지 확인 메소드
            System.out.println(it.next()); // set은 순서가 없기 때문에 iterator로 써야 한다./
        }
    }
}
class Student{
    private String name;
    private int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        //Student.equals(Student객체) 과 같이 호출될 것임
        // this(현재 객체) <--> obj(전달받은 객체)
        if (o instanceof  Student){
            Student other = (Student) o;
            if (this.name.equals(other.name)&& this.score == other.score){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        // 모든 필드의 값이 동일할 경우 같은 hashCode 반환
        String hash = name + score;
        return hash.hashCode();
    }
}


