package asd;

import java.util.Scanner;

public class If {
		/*
		 * 조건문 : 조건에 따라 프로그램 흐름을 제어하고자 할 때 사용
		 * 	- "조건식" 을 통해 참인지 거짓인지 판단하여 그에 해당하는 코드를 실행
		 * 		* 조건식의 결과 : true / false
		 * 		* 연산자 : 비교 연산자(대소/동등), 논리 연산자 (&&,||) 등등
		 * 	- if / switch
		 * 		* if문
		 * 				if(조건식){
		 * 					// 조건식의 결과가 참일 때 실행할 코드
		 * 				}else if(조건식2){
		 * 					// 조건식의 결과가 거짓이고, 조건식2의 결과가 참일때 실행되는 코드
		 * 				}else {
		 * 					// 조건식, 조건식2의 결과가 모두 거짓일 때 실행할 코드
		 * 				}
		 * 		* switch문
		 * 			switch(조건식 => 비교대상){
		 * 				case 값1: 
		 * 					// 비교대상 == 값1 인 경우 실행코드;
		 * 					break;		// break를 만나면 switch문이 종료
		 * 				default:
		 * 					// 모든 case 값에 해당되지 않을 경우 실행코드
		 * 			}
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			String result;
			if(ch >= 'A' && ch <='Z') {
				result = "대문자";
			}else {
				result = "소문자";
			}
			System.out.println(result);
		}
	

}
