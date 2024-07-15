package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
        Employee EMP1= new Employee();
        EMP1.setEmpNo(100);
        EMP1.setEmpName("홍길동");
        EMP1.setDept("영업부");
        EMP1.setJob("과장");
        EMP1.setAge(25);
        EMP1.setGender('남');
        EMP1.setSalary(25000000);
        EMP1.setBonusPoint(0.05);
        EMP1.setPhone("010-1234-5678");
        EMP1.setAddress("서울시 강남구");

        System.out.printf("[%d] %s | %s | %s | %d\n",EMP1.getEmpNo(),EMP1.getEmpName(),
                EMP1.getDept(),EMP1.getJob(),EMP1.getAge());
    }
}
