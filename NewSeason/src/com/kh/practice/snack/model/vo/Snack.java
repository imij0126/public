package com.kh.practice.snack.model.vo;

public class Snack {
    private String kind;
    private String name;
    private String flavor;
    private int numOf;
    private int price;

    public Snack(){}
    public Snack(String kind, String name, String flavor, int numOf,int price){
        this.kind = kind;
        this.name = name;
        this.flavor = flavor;
        this.numOf = numOf;
        this.price = price;
    }
    public String information(){
        //빵(케이크 - 블루베리) 1개 15000원
        // "{종류}({이름}-{맛}) {개수}개{가격}원"
        return kind +"(" + name + " - " + flavor + ")" + numOf + "개 " +price + "원";

        // [참고] String.format ("출력할 형식" , 변수 / 값들,) : Strin
        //return String.format("%s(%s - %s) %d개 %d원",kind,name,flavor,numOf,price );
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumOf() {
        return numOf;
    }
    public void setNumOf(int numOf) {
        this.numOf = numOf;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
