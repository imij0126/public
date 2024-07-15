package com.kh.practice1;

//Scanner 클래스 import : 외부 경로의 클래스를 사용할 때 선언
import java.util.Scanner;

public class VariablePractice1 {
	//Q 이름, 성별,나이, 키를 사용자에게 입력받아 
	//		각각의 값을 변수에 담고 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		//Scanner 객체를 사용해 문자열 입력받고, 문자열 타입 name이라는 변수 값 저장
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		System.out.printf("키는 %.1fcm이고 %d살 %s인 %s님 반갑습니다.\n",height,age,gender,name); // \n은 줄바꿈 표시
		System.out.println("@@@@@");
	}
}
