package com.kh.ch05_object;

public class Animal {
    // 정보 은닉
    private String name;  // 이름
    private int age;  // 나이
    private char gender;  // 성별
    private String masterName; // 주인이름
    private String type; //종

    // 캡슐화
    // 생성자 : 기본생성자, 모든 필드를 매개변수로 갖는 생성자
    public Animal(){}
    public Animal(String name, int age, char gender, String masterName, String type) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.masterName = masterName;
        this.type = type;
    }
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
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getMasterName() {
        return masterName;
    }
    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    @Override
    public String toString(){
        return "이름 : "+name
                + ", 나이 : " + age
                + ", 성별 : " + gender
                + ", 주인 이름 : "+ masterName
                + ", 종 : " +type;
    }
}
