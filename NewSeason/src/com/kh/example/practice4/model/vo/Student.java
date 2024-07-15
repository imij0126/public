package com.kh.example.practice4.model.vo;

public class Student {
    private static int grade; // 학년
    private static int classroom; // 반
    private String name; // 학생 이름
    private double height; // 키
    private String gender;

    //초기화 블록
    {
        grade = 1;
        classroom = 7;
        name = "임수진";
        height = 170.5;
        gender = "여";
    }


    public Student(){
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getClassroom(){
        return classroom;
    }
    public void setClassroom(int classroom){
        this.classroom = classroom;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void information(){
        System.out.println(grade + "학년" + " " + classroom + "반 " + gender +" "+ name +" 입니다.");
        System.out.println("grade = "+grade +", classroom = " +classroom +", gender = "
                +gender+", name : " + name);
    }
}
