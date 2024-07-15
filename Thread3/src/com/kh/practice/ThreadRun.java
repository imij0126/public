package com.kh.practice;

public class ThreadRun {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 task = new Task2();
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
