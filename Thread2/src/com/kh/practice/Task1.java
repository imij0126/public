package com.kh.practice;

public class Task1 extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1;i <=30;i++){
                if (i % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
