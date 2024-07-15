package com.kh.practice;

public class AndroidPhone implements Phone{
    public void call(String number){
        System.out.println("AndroidPhone....");
        System.out.println("call..."+number);
    }
}
