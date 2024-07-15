package com.kh.practice.student.view;

import com.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
    private StudentController ssm = new StudentController();

    public StudentMenu() {
        System.out.println("========== 학생 점수 =========");
        Student[] students = ssm.printStudent();
        for (Student student : students) {
            System.out.println(student.inform());
        }

        int sum = ssm.sumScore();
        double[] avg = ssm.avgScore();

        System.out.println("===== 성적 출력 =====");
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg[1]);

        System.out.println("===== 시험 결과 =====");
        for (Student student : students) {
            String result = student.getScore() >= StudentController.CUT_LINE ? "합격" : "불합격";
            System.out.println(student.getName() + " 학생은 " + result + "입니다.");
        }
    }
}