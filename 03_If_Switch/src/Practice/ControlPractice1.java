package Practice;

import java.util.Scanner;

public class ControlPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int number = sc.nextInt();
		
		switch(number) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				break;
			default:
				System.out.println("해당 번호에 해당되지 않습니다. 다시 입력하세요");
				break;
		}
	}

}
