package com.kh.example.practice1.model.vo;

public class Product {
    // 필드부(변수부) - 데이터를 담을공간
    private String name;        //제품명(이름)
    private int price;          //가격
    private String brand;       //브랜드명

    //메소드부
    //getter/setter : private 으로 선언된 변수에 접근할 수 있도록 하는 메소드

    // 기본 생성자
    public Product() {}
    //getter 메소드 : 해당 변수의 값을 조회하는 기능을 제공하느 메소드
    public String getname(){
        return name;
    }
    // setter 메소드 : 해당 변수에 값을 저장하는 기능을 수행하는 메소드
    public void setName(String name){ //set 변수명(해당변수의자료형 변수명)
        this.name = name; //
    }
    //price 변수의 getter//setter
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    //brand 변수의 getter / setter

    //메소드부
    // + information() : void
    // 정보 출력 메소드
    public void information() {
        //현재 클래스의 데이터를 출력
        System.out.println("pName=" + name +", price = " + price +", brand=" +brand);
    }
}
