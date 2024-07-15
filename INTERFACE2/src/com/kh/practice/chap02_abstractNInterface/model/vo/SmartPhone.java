package com.kh.practice.chap02_abstractNInterface.model.vo;

//CellPhone, TouchDisplay 인터페이스를 구현(상속)
public abstract class SmartPhone implements CellPhone,TouchDisplay{
    private String maker;
    public SmartPhone(){}
    // 추상 메소드 : 6개 cellPhone - 4개, TouchDisplay - 1개, 본인꺼 SmartPhone -1개
    public abstract String printInformation();

    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
}
