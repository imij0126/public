package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
    private Student[] sArr = new Student[5];
    public static final int CUT_LINE = 60;

    public StudentController() {
        sArr[0] = new Student("김길동", "자바", 100);
        sArr[1] = new Student("박길동", "디비", 50);
        sArr[2] = new Student("이길동", "화면", 85);
        sArr[3] = new Student("정길동", "서버", 60);
        sArr[4] = new Student("홍길동", "자바", 20);
    }

    public Student[] printStudent(){ // getter의 역할을 하는 메소드
        return sArr; //변수의 담긴 값을 반환
    }
    public int sumScore(){
        // 객체 배열의 점수의 합을 반환
        // Student 클래스에 점수를 저장하는 변수 : score
        int total=0;
        for (int i = 0;i<sArr.length;i++){
            total += sArr[i].getScore();
        }
        return total;
        //  아래는 향상된 for문
        //  int total = 0;
        //  for(Student student(변수명 설정한거) : sArr){
        //      total += student.getScore();
        // }
        // return total;
    }
    public double[] avgScore(){
        //1.double 배열을 만들기
        //2.sumscore의 리턴 값을 0번째 인덱스에 저장
        //3.합의 평균을 1번째 인덱스 저장
        //4.배열 리턴
        double[] avg = new double[2];
        int sum = sumScore();
        avg[0] = sum;
        avg[1] = sum / (double) sArr.length;
        return avg;
    }
}
