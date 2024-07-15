package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setGrade(2);
        stu1.setClassroom((int)(Math.random()*10+1));
        stu1.setGender("남자");
        stu1.setHeight(166.8);
        stu1.setName("김인창");
        stu1.information();

        Student stu2 = new Student();
        stu2.setGrade(2);
        stu2.setClassroom((int)(Math.random()*10+1));
        stu2.setGender("여자");
        stu2.setHeight(175.9);
        stu2.setName("joeanna dark");
        stu2.information();

        Student stu3 = new Student();
        stu3.setGrade(3);
        stu3.setClassroom((int)(Math.random()*10+1));
        stu3.setGender("남자");
        stu3.setHeight(172);
        stu3.setName("김두한");
        stu3.information();
    }
}
