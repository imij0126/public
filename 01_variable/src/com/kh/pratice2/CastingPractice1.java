package com.kh.pratice2;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		String str = sc.next();
		
		char ch = str.charAt(0);
		System.out.println("a unicode : " + (int)ch);
	}

}
