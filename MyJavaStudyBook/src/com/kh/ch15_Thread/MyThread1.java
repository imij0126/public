package com.kh.ch15_Thread;

import java.util.Date;

/*
    * 스레드 정의 방법 1. Thread 클래스 TKDTHR
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        // 현재 실행 중인 스레드의 정보 : Thread.currentThread()
        String name = Thread.currentThread().getName();
        for (int i = 0;i<10;i++){
            System.out.println(name + " : " + new Date().getTime());
            // 3초간 재우기.. Thread.sleep(millis)
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + " : -----END-----");
    }
}
