package Practice;

import java.util.Scanner;

public class ControlPractice1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실행할 기능을 선택하세요 : ");
		int choose = sc.nextInt();
		
		ControlPractice1_1 cp = new ControlPractice1_1();
		switch(choose) {
		case 1:
			cp.practice1();
			break;
		case 2:
			cp.practice2();
			break;
		case 3:
			cp.practice3();
			break;
		case 4:
			cp.practice4();
			break;
		case 5:
			cp.practice5();
			break;
		case 6:
			cp.practice6();
			break;
		case 7:
			cp.practice7();
			break;
		case 8:
			cp.practice8();
			break;
		case 9:
			cp.practice9();
			break;
		case 11:
			cp.practice11();
			break;
		default:
			System.out.println("10번을 제외한 1~11까지 입력하세요.");
		}		
	}
}