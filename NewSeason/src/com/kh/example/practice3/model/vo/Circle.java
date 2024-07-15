package com.kh.example.practice3.model.vo;

public class Circle {
    private static final double PI = 3.14;
    private static int radius;
    public Circle(){
    //radius 변수의 getter/setter
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void incrementRadius(){
        radius++;
    }
    public void getAreaOfCircle(){
        System.out.println("원의 넓이 : "+(PI*radius*radius));
    }
    public void getSizeOfCircle(){
        System.out.println("원의 둘레 : "+(PI * radius*2));
    }
}
