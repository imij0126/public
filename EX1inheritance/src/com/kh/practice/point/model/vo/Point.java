package com.kh.practice.point.model.vo;

public class Point {
    private int x;
    private int y;
    public Point(){}
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    //메소드부
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override   //object 클래스로 부터 오버라이딩 된 메소드를 의미함!
    public String toString() {
        //return "{x변수에 담긴값},{y변수에 담긴값}";
        return x + ", " +y;
    }
}
