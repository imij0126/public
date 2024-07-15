package Com.kh.practice.chap03;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력하세요 ");
		}else {
			for(int i =1 ; i <= num;i++) {
				System.out.print(i);
				if(i != num) {
					System.out.print(" ");
				}
			}
		}
		
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.print("1 이상의 숫자를 입력하세요.");
			}else {
				for(int i = 1; i <=num;i++) {
					System.out.print(i);
					if(i != num) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.print("1 이상의 숫자를 입력하세요.");
		}else {
			for(int i = num; i < num+1;i--) {
				System.out.print(i);
				if(i != num+1) {
					System.out.print(" ");
				}
				if(i ==1) {
					break;
			}
			}
		}
	}
	public void practice4() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				continue;
			}else {
				for(int i = num; i < num+1;i--) {
					System.out.print(i);
					if(i != num+1) {
						System.out.print(" ");
				}
				if(i ==1) {
					break;
				}
				}break;
			}
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum=0;
		for(int i =1; i <=num ;i++) {
			sum += i;
			System.out.print(i);
			if(i < num) {
				System.out.print("+");
			}
		}System.out.println(" = "+sum);

	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if(num1 >0 && num2>0 && num1 != num2) {
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i);
					if(i != num1+1) {
						System.out.print(" ");
					}
				}
			}else if(num2 > num1) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i);
					if(i != num2+1) {
						System.out.print(" ");
					}
			}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		}
	public void prcatice7() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			if(num1 >0 && num2>0 && num1 != num2) {
				if(num1 > num2) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i);
						if(i != num1+1) {
							System.out.print(" ");
						}
					}break;
				}else if(num2 > num1) {
					for(int i = num1; i <= num2; i++) {
						System.out.print(i);
						if(i != num2+1) {
							System.out.print(" ");
						}
				}break;
				}
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int gugu = sc.nextInt();
		System.out.println("=====" + gugu + "단 ======");
		for(int j = 1;j <=9;j++) {
			System.out.println(gugu + "x" + j +"=" + (gugu*j));
			}System.out.println();
		
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int gugu = sc.nextInt();
		if(gugu < 10) {
			for(int i = gugu; i <=9; i++) {
				System.out.println("====="+i+"단======");
				for(int j=1;j <=9;j++) {
					System.out.println(i + "x" + j + " = " + i*j);
				}
		}
		}else {
			System.out.println("9이하의 숫자만 입력해주세요");
		}
	}
	public void practice10() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int gugu = sc.nextInt();
			if(gugu < 10) {
				for(int i = gugu; i <=9; i++) {
					System.out.println("====="+i+"단======");
					for(int j=1;j <=9;j++) {
						System.out.println(i + "x" + j + " = " + i*j);
					}
					
				
				
			}break;
			}else {
				System.out.println("9이하의 숫자만 입력해주세요");
			}
		}
		}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		for(int i = 0;i <=9;i++) {
			System.out.print(num1+(num2*i));
			if(i != num1+1) {
				System.out.print(" ");
			}
		}
	}
	public void practice12() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("연산자(+,-,*,/,%) : ");
			String Oper = sc.next();
			if (Oper.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;  // while 루프를 종료
            }
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			switch(Oper) {
				case "+":
					System.out.printf("%d + %d = %d",num1,num2,num1+num2);
					break;
				case "-":
					System.out.printf("%d - %d = %d",num1,num2,num1-num2);
					break;
				case "*":
					System.out.printf("%d x %d = %d",num1,num2,num1*num2);
					break;
				case "/":
					if(num2 == 0) {
						System.out.println("0으로 나눌수 없습니다. 다시입력해주세요");
					}else {
						System.out.printf("%d / %d = %d",num1,num2,num1/num2);
					}
					break;
				case "%":
					if(num2 == 0) {
						System.out.println("0으로 나눌수 없습니다. 다시입력해주세요");
					}else {
						System.out.printf("%d %% %d = %d",num1,num2,num1%num2);
					}
					break;
				default :
					System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
				}System.out.println("");
			}
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		for(int i =4;i >=1; i--) {
			System.out.println("*");
			for(int j = 4;j-1 >1 ;j--) {
				System.out.print("*");
			}
		}
	}
	public void practice1_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.print("양수가 아닙니다.");
		}
		
		for(int i =1; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
		}
		
	}
}

