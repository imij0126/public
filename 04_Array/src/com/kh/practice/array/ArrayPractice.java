package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		//1.길이가 10인 배열 선언 (1부터 10까지의 값을 저장 => int)
		int[] arr =new int[10];
		//2. 반복문을 사용해 배열 인덱스에 그 값을 저장
		//for(int i =1; i<=10; i++) {
		//	arr[i] =i+1;   // arr 배열의 i-1 위치에 i값을 저장
		//}
		//3. 반복문을 사용해 각 인덱스의 값을 출력
		for(int i =0;i<10;i++) {
			arr[i] = i+1;
		}
		for(int i = 0;i<10;i++) {
			System.out.print(arr[i]);
			if(i!=9) {
				System.out.print(" ");
			}
		}
	}
	public void practice2() {
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i]);
			if(i !=arr.length-1) {
				System.out.print(" ");
			}
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		for(int i =0;i<arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]);
			if(i != arr.length-1) {
				System.out.print(" ");
			}
		}
	}
	public void practice4() {
		String []arr = {"사과","귤","포도","복숭아","참외"};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//System.out.print(arr[num]);
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].equals("귤")) {
				System.out.print(arr[i]);
			}
		}
	}
	public void practice5() {
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		//문자열의 길이 : 문자열_변수/값.length()
		//배열 길이 : 배열_변수/값.length
		char[] arrch = new char[str.length()];
		//입력받은 문자열을 배열에 문자 하나하나 저장 = >문자형 배열
		for(int i = 0;i<arrch.length;i++) {
			arrch[i] = str.charAt(i);
			// str.charAt(0) : a
			// str.charAt(1) : p
			// str.charAt(2) : p //각각 스페링 1개마다 인덱스에 저장
		}
		System.out.printf("%s에 %c 가 존재하는 위치(인덱스) : ", str,ch);
		int count = 0;
		for(int i = 0;i <arrch.length; i++) {
			if(arrch[i] == ch) {             // 문자형 배열의 1번째 값과 사용자가 입력한 문자값이 같다면,
				count++;			             // 개수 증가
				System.out.print(i + " ");   // 해당 위치의 인덱스 값을 출력!
			}
		}
		System.out.println();
		System.out.println(ch + "의 개수 : " +count);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		String []arr = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		if(num < 7 && num >=0) {
			System.out.print(arr[num]);
		}else {
			System.out.print("잘못 입력하셨습니다.");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		int sum = 0;
		for(int i =0;i < num;i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			arr[i]=num2;
			sum += num2;
		}
		for(int j=0;j<num;j++) {
			System.out.print(arr[j] + " ");		
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		//3이상인 홀수 자연수
		if(num >=3 && num %2 != 0) {
			// 입력받은 정수 길이만큼의 정수형 배열 선언 및 할당
			int[] arr = new int[num];
			int value = 1;		//배열에 저장할 값
			for(int i =0; i <num; i++) {
				if(i < num/2) {				//중간 위치 계산 : num / 2
					arr[i] = value++;		//중간 위치까지는 증가
				}else {
					arr[i] = value--;		//중간 위치부터 감소
				}
			}
			for(int i = 0; i <arr.length;i++) {
				if(i <arr.length-1) {
					System.out.print(arr[i] + ", ");
				}else {
					System.out.print(arr[i]);
				}
			}
			break;
		}else {
			System.out.println("다시 입력하세요");
		}
		}
	}
	public void practice9() {
		String []menu = {"양념","불닭","치즈","황금올리브","마라","간장","파닭","후라이드"};
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();
		//int count = 0;
		boolean isExist = false;
		for(int i =0;i<menu.length;i++) {
			if(menu[i].equals(name)) {
				//count++;
				isExist = true;
				break;
			}
		}
		if(isExist) { //count >0
			System.out.println(name + "치킨 배달 가능");
		}else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String ssn = sc.next();
		//문자열의 문자 하나하나를 문자형 배열로 생성 생성 후 값을 저장
		// -문자형 배열 선언 및 할당 (문자열 길이만큼)
		char[] origin = new char[ssn.length()];
		// - 반복문을 사용해 문자열 처음위치부터 마지막 위치까지 문자를 배열에 저장
		for(int i=0;i<origin.length;i++) {
			origin[i] = ssn.charAt(i);
		}
		// 원본 배열 값의 변경 없이 복사본 배열의 값을 변경 => 깊은 복사
		char[] copy = new char[origin.length];
		for(int i=0;i<copy.length;i++) {
			if(i <=7) {
				copy[i] = origin[i];		//인덱스 7번 위치까지
			}else {
				copy[i] = '*';
			}
		}
		//복사본 배열값 출력
		for(int i = 0; i<copy.length;i++) {
			System.out.print(copy[i]);
		}
		//Arrays.sort(배열명); => 배열을 오름차순으로 정렬
		//System.out.println(Arrays.toString(copy)); //Arrays.toString(배열명) : 배열 데이터를 출력[값0,값1 등등]
	}
	public void practice13() {
		//Math.random();
		int [] numbers = new int[10];
		for(int i =0; i <numbers.length; i++) {
			numbers[i] = (int)(Math.random()*10+1);
			// i-1(현재 위치의 직전 위치)까지 중복값이 있는지 확인
			for(int j =0;j<1;j++) {
				//i번째 위치의 값과 j번째 위치의 값을 비교
				//같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시저장할수 있도록
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		for(int i =0;i<numbers.length;i++) {
			System.out.print(numbers[i]+ " ");
		}
		
	}
}
