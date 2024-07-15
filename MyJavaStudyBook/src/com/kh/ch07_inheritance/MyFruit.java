package com.kh.ch07_inheritance;

// Fruit 클래스의 상속 받을 것임! --> extends
public class MyFruit extends Fruit {
    // 이름과 가격정보를 받아 초기화해주는 생성자
    // --> 매개변수가 2개인 생성자 필요!
    public MyFruit(String name,int price){
        // 부모클래스 맴버에 접근할 때 super 사용
        //  - 부모클래스의 생성자 호출 : super()
        //  - 부모클래스의 맴버 (변수/메소드) 접근 : super.맴버이름
        super(name, price);
    }
    // toString() 오버라이딩
    @Override
    public String toString(){
        // 상속을 받았어도 멤버 접근제한자 private인 경우는 직접 접근 불가
        return "내가 좋아하는 과일은 "+getName() +" 이다."; // 혹은 super.name 으로 변경
    }
}
