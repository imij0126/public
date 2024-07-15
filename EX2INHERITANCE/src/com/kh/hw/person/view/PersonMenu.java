package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

import java.util.Scanner;

public class PersonMenu {
    private Scanner sc = new Scanner(System.in);
    private PersonController pc = new PersonController();
    public void mainMenu(){
        while (true) {
            int[] counts = pc.personCount();
            System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
            System.out.println("현재 저장된 학생은 M명입니다.");
            System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
            System.out.println("현재 저장된 사원은 N명입니다.");
            System.out.println("1. 학생 메뉴");
            System.out.println("2. 사원 메뉴");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 :");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
    public void studentMenu(){
        while (true) {
            int studentcount = pc.personCount()[0];
            if(studentcount == 3){
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
                System.out.println("1. 학생 보기");
                System.out.println("9. 메인으로");
            }else {
                System.out.println("1. 학생 추가");
                System.out.println("2. 학생 보기");
                System.out.println("9. 메인으로");
            }
            System.out.print("메뉴 번호 : ");
            int menu2 = sc.nextInt();
            switch (menu2) {
                case 1:
                    insertStudent();
                    break;
                case 2:
                    printStudent();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("다시 입력하세요");
            }
        }
    }
    public void employeeMenu(){
        while (true) {
            int employeeCount = pc.personCount()[1];
            if (employeeCount == 10) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
                System.out.println("1. 사원 보기");
                System.out.println("9. 메인으로");
            }else {
                System.out.println("1. 사원 추가");
                System.out.println("2. 사원 보기");
                System.out.println("9. 메인으로");
            }
            System.out.print("메뉴 번호 : ");
            int menu3 = sc.nextInt();
            switch (menu3) {
                case 1:
                    insertEmployee();
                    break;
                case 2:
                    printEmployee();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("다시 입력하세요 ");
            }
        }
    }
    public void insertStudent(){
        while (true) {
            System.out.print("학생 이름 : ");
            String stu = sc.next();
            System.out.print("학생 나이 : ");
            int age = sc.nextInt();
            System.out.print("학생 키 : ");
            double height = sc.nextDouble();
            System.out.print("학생 몸무게 : ");
            int weight = sc.nextInt();
            System.out.print("학생 학년 : ");
            int grade = sc.nextInt();
            System.out.print("학생 전공 : ");
            String major = sc.next();
            pc.insertStudent(stu, age, height, weight, grade, major);
            System.out.println("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
            String str = sc.next();
            if (str.equals('x')||str.equals('X')){
                break;
            }else {
                return;
            }
            if ()
        }
    }
    public void printStudent(){

    }
    public void insertEmployee(){
        int Employeecount = pc.personCount()[0];
        while (true){
            System.out.print("사원 이름 : ");
            String name = sc.next();
            System.out.print("사원 나이 : ");
            int age = sc.nextInt();
            System.out.print("사원 키 :  ");
            double height = sc.nextDouble();
            System.out.print("사원 몸무게 : ");
            int weight = sc.nextInt();
            System.out.print("사원 급여 : ");
            int salary = sc.nextInt();
            System.out.print("사원 부서 : ");
            String dept = sc.next();
            pc.insertEmployee(name,age,height,weight,salary,dept);
        }
    }
    public void printEmployee(){

    }
}
