package com.kh.ch05_object;

public class Student {
    /*
        접근제한자 : 접근할 수 있는 범위 제한하는거
        public(+) > protected(#) > default(~) > private(-)
     */
    String name;
    int age;
    double height;
    String phone;
    String address;
    // 필드부 : [접근제한자] [예약어] 자료형 필드명;
    public Student(){} // 기본 생성자는 접근제한자 + 클래스명 (void는 절대 쓰면 안된다!!!!!!!!
    public Student(String name,int age,String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    public Student(String name,int age,double height,String phone,String address){
        this.name = name;
        this.age = age;
        this.height=height;
        this.phone=phone;
        this.address=address;
    }
    // 생성자부 : [접근제한자] 클래스명([매개변수]) {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // 메소드부 : [접근제한자] [예약어] 반환타입 메소드명([매개변수]) {}

    @Override
    public String toString() {
        //반환타입 "void" 가 아닐때는 반드시 return 값; 부분이 있어야 함
        //        => void: 반환값이 없음을 의미
        return "이름 : " +name +
                ", 나이 : " + age
                +", 키 : " + height
                +", 연락처 : " + phone
                + ", 주소 : " + address;
    }
}
