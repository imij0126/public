package com.kh.ch06_objectArray;

public class Product {
    private String name; // 제품명
    private int price;   // 가격

    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    @Override
    public String toString(){
        return name +" " + price;
    }
}
