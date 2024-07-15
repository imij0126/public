package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.array.ArrayPractice;

public class Run {
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		int tt = sc.nextInt();
		switch(tt) {
		case 1:
			ap.practice1();
			break;
		case 2:
			ap.practice2();
			break;
		case 3:
			ap.practice3();
			break;	
		case 4:
			ap.practice4();
			break;		
		case 5:
			ap.practice5();
			break;		
		case 6:
			ap.practice6();
			break;			
		case 7:
			ap.practice7();
			break;		
		case 8:
			ap.practice8();
			break;		
		case 9:
			ap.practice9();
			break;		
		case 10:
			ap.practice10();
			break;		
		case 13:
			ap.practice13();
			break;		
		}
	}

}
