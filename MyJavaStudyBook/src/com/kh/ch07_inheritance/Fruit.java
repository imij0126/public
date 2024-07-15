package com.kh.ch07_inheritance;

public class Fruit {
    private String name;
    private int price;
    public Fruit(){}
    public Fruit(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    @Override
    public String toString(){
        return "이름 : "+name+", 가격 : "+price;
    }
}
