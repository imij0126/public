package com.kh.example.practice6.model.vo;

public class Book {
    private String title; // 장르
    private String publisher; // 출판사
    private String author; // 작가
    private int price; // 가격
    private double discountRate; //할인 가격

    public Book(){} // 기본 생성자 : 초기화할 데이터 없이 객체 생성

    // 매개변수가 3개인 생성자 : 전달된 데이터를 변수에 초기화하여 객체 생성
    public Book(String title,String publisher,String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
    public Book(String title,String publisher,String author,int price,
                double discountRate){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }
    public void inform(){
        // 정보를 출력 : 현재 클래스의 필드(변수)의 값을 출력
        System.out.printf("title=%s, publisher=%s, author=%s, price=%d, discountRate=%.2f\n"
        ,title,publisher,author,price,discountRate);
    }
}
