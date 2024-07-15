package com.kh.practice1.run;

import java.util.Scanner;

public class OperationPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		
		System.out.print("영어 : ");
		double English = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int)(korean + math + English);
		int avg = (int)total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}

}
