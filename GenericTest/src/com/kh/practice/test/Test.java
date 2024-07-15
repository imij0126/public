package com.kh.practice.test;

interface inter1<Jonney>{
    void method1(Jonney data);
}
interface inter2<V>{
    void method2(V data);
}
class relic<r> implements inter1<r>,inter2<r>{
    public void method1(r data){
        System.out.println(data);
    }
    public void method2(r data){
        System.out.println(data);
    }
}

public class Test {
    public static void main(String[] args) {
        relic<String> r1 = new relic<>();
        r1.method1("arasaka");
        r1.method2("jackie");

        relic<Integer> r2 = new relic<>();
        r2.method1(11111111);
        r2.method2(222222222);
    }
}
