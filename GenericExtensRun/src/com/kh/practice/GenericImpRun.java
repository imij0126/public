package com.kh.practice;

interface Inter1<T>{
    /*public abstract*/void method1(T data);
}
interface Inter2<F> {
    void method2(F data);
}
class DataClass04<E> implements Inter1<E>,Inter2<E>{
    public void method1(E data){
        System.out.println(data);
    }
    //void method1(E data);
    public void method2(E data){
        System.out.println(data);
    }
}

public class GenericImpRun {
    public static void main(String[] args) {
        //DataClass04 객체를 생성해,
        // "좋아하는 색은" --> method1사용, "xxx다" -> method2 사용
        DataClass04<String> d4 = new DataClass04<>();
        d4.method1("좋아하는 색은");
        d4.method2("검은색입니다.");

        DataClass04<Integer> d5 = new DataClass04<>();
        d5.method1(10000);
        d5.method2(121212);
    }
}
