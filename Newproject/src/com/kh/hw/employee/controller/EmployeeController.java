package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
    private Employee e;

    public void add(int empNo, String name, char gender, String phone) {
        // 받은 매개변수만큼 매개변수가 있는 생성자를 통해 값을 저장
        // = > 매개변수 생성자로 객체 생성 후 e라는 변수에 할당
        e = new Employee(empNo, name, gender, phone);
    }

    public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
        e = new Employee(empNo, name, gender, phone, dept, salary, bonus);

    }

    public void modify(String phone) {
        if (e != null) {
            e.setPhone(phone);
        }
    }

    public void modify(int salary) {
        if (e != null) {
            e.setSalary(salary);
        }
    }

    public void modify(double bonus) {
        if (e != null) {
            e.setBonus(bonus);
        }
    }

    public Employee remove() {
        Employee temp = e;
        e = null;
        return temp;
    }

    public String inform() {
        if(e == null){
            return null;
        }else {
            // printEmployee() 메소드를 사용해 사원 정보 반환
            return e.printEmployee();
        }
    }
}
