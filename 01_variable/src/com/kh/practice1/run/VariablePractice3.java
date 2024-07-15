package com.kh.practice1.run;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double length = sc.nextDouble();
		System.out.printf("면적 : %.2f\n", width * length);
		System.out.printf("둘레 : %.1f\n", (width + length)*2);
		
	}

}
