package com.kh.example.practice.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		//기본 생성자를 통해 Member 타입의 객체 생성
		Member m = new Member();
		
		// changeName 을 이용해 값을 변경
		//m.meberName = "이름"; 이미 private으로 접근제한을 두어 접근 불가 
		m.changeName("김인창");
		// printName 을 이용해 출력
		m.printName();
	}

}
