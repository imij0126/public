package com.kh.practice.run;

import com.kh.practice.dimension.DimensionPractice;
import java.util.Scanner;

public class Run1_1 {

	public static void main(String[] args) {
		DimensionPractice DP = new DimensionPractice();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		int tt = sc.nextInt();
		switch(tt) {
		case 1:
			DP.practice1();
			break;
		case 2:
			DP.practice2();
			break;	
		case 3:
			DP.practice3();
			break;		
		case 4:
			DP.practice4();
			break;		
		case 5:
			DP.practice5();
			break;		
		case 6:
			DP.practice6();
			break;		
		case 7:
			DP.practice7();
			break;		
			
		}

	}

}
