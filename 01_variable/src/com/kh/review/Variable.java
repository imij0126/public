package com.kh.review;

public class Variable {
	public static void main(String[] args) {
		//pintVariable();
		declareVariable();
	}
	public static void pintVariable() {
		/*
		 * 변수의 목적?
		 *  - 데이터를 저장하기 위한 공간
		 *  - 가독성 증가 (변수 이름에 의미있게 지어줌으로써)
		 *  - 재사용성 증가 (한번 값을 저장하여 필요할 때마다 변수이름을 가져다가 사용)
		 *  -유지보수가 쉬워짐 (한번 저장해놓은 위치에 값을 변경함으로써)
		 */
		
		// ex) 월급 = 시급 x 근무시간 x 근무일수
		//      OOO : 0000원 형식으로 출력
		System.out.println("아이유 : " + (9860 * 6 * 14));
		System.out.println("홍길동 : " + (9860 * 8 * 14));
		System.out.println("히토리 : " + (9860 * 6 * 14));
		System.out.println("료    : " + (9860 * 8 * 14));
		
		int pay = 12000; // 정수 자료형
		int time = 6;
		int day = 14;
		
		System.out.println("--------------------------");
		
		System.out.println("아이유 : " + (pay * time * day) + "원");
		System.out.println("홍길동 : " + (pay * time * day) + "원");
		System.out.println("히토리 : " + (pay * time * day) + "원");
		System.out.println("료    : " + (pay * time * day) + "원");
	}

	public static void declareVariable() {
		/*
		 * 변수의 선언 : 값을 기록하기 위한 변수를 메모리 공간에 할당 및 확보
		 * [표현법]
		 * 			자료형 변수명;
		 * 		- 자료형 : 변수의 크기 및 모양을 지정하는 부분
		 * 		- 변수명 : 변수의 이름을 부여하는 부분(의미 부여!)
		 * 명명규칙
		 * 		[1]카멜케이스 : 소문자로 시작하고, 다른 단어가 붙을땐 대문자로 시작
		 * 			=> 클래스명의 경우 : 무조건 앞에 대문자로 시작
		 * 		[2] 대소문자를 구분함 
		 * 		[3] 숫자로 시작하면 안됨, 예약어 사용 안됨
		 * 		[4] 특수문자는 '$' 또는 '_' 만 사용 가능
		 * 주의사항
		 * 		- 같은 영역 안({//})에서는 동일한 변수명으로 선언 불가 (중복 불가!)
		 * 		- 해당 영역 안({//})에서 선언된 변수는 그 영역 안에서만 사용가능
		 * 			=> 다른 영역에서 사용 불가
		 */
		int num =  10;
		int num2 = 30;
		// 1. 논리형 (boolean). 논리값 (true/false) 1byte
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isTrue의 값 : " + isFalse);

		isTrue = 1 + 3 > 1;    // isTrue 의 값 : true
		isFalse = 2 *3 < 0;    // isFalse 의 값 : false
		// 2. 숫자형 (정수/실수)
		// 2-1. 정수형 (소수점 x. 딱 떨어지는 수)
		//		byte (1b) / short (2b) / int (4b) / long (8b)
		byte bNum;      // 1byte(-128~127)
		bNum = -128;
		
		//bNum = 1000;  // 범위를 벗어나면 오류 발생
		
		// 2-2. 실수형 (소수점 가능)
		//		float (4b) / double (8b)
		float fNum = 0.0f; // 0.0값을 저장
							// 소수점 7자리까지 표현 가능
							// 값 자체(리터럴)을 저장할 때 값 뒤에 f를 붙여줌
		double dNum = 0;	// 소수점 15자리까지 표현 가능. 실수형의 기본 자료형
		
		// -----------
		// 3. 문자형 (char / String)
		// 3-1. 문자
		char ch = 'a';		// 2b
		char kim;
		kim = '김';
		
		//  3-2. 문자열
		String str;			//참조형(참조 자료형)
		str = "aaa";
		
		//---------------------------
		// 상수 : 변하지 않는 값을 저장하는 공간
		//  [표현법] final 자료형 상수명;
		final int AGE;		// 명명규칙 : 대문자만 사용, 단어사이는 '_' 구분
		AGE = 10;
		//AGE = 20;			// 값이 한 번 저장된 이후에, 변경이 불가능!
		
		Math.random();
		System.out.println("Math.PI의 값 : " + Math.PI);
		//참고
		int temp = 999_999_999; //가독성을 위해 3자리마다 _표시 가능
	}
}
