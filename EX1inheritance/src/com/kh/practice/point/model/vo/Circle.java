package com.kh.practice.point.model.vo;

public class Circle extends Point{ // extends Point -> Point 클래스로 상속
    // 상속을 받으므로써 x,y 변수를 멤버로 가지게 된다.
    // 따라서, Circle 클래스는 총 3개의 변수를 가지게 된다.
    private int radius;
    public Circle(){}
    public Circle(int x, int y, int radius){
        /*
        this.x = x;
        this.y = y;
        or
        setX(x);
        setY(y);
         */
        super(x,y);      //Point(부모클래스)의 매개변수가 2개인 생성자 호출
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        // "{x변수가 저장한 값}, {y변수에저장된값}, {radius 변수에저장된값}"
        return super.toString() + ", " + radius;
        //return getX() + ", "+ getY()
    }
}
