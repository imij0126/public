package com.kh.practice.list;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> arrStack = new ArrayList<>();
    public void push(String data){
        arrStack.add(data);
    }
    public String pop(){
        if(arrStack.isEmpty()){ //리스트가 비어있다면 "리스트가 비었습니다."
            return "리스트가 비었습니다.";
        }
        //그렇지 않은 경우, 리스트의 마지막 인덱스(위치) 의 데이터 반환
        //remove(index) : 해당 index 위치의 데이터를 제거하면서 해당 데이터 반환
        return arrStack.remove(arrStack.size()-1);
    }
}