package Com.kh.practice.chap02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		System.out.print("처리할 메소드 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			p.method1();
			break;
		case 2:
			p.method2();
			break;
		case 3:
			p.method3();
			break;
		case 4:
			p.method4();
			break;
		case 5:
			p.method5();
			break;
		case 6:
			p.method6();
			break;
		}
		//p.method1();
		//p.method2();
		//p.method3();
		//p.method4();
		//p.method5();
		//p.method6();
		
	}

}
