package com.kh.practice;

public class Task1 extends Thread{
    @Override
    public void run() {
        String say = "안녕하세요";
        String answer = Thread.currentThread().getName();
        System.out.println(say + " : " +answer);
    }
}
