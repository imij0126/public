package Practice;

import java.util.Scanner;

public class ControlPractice1_1 {
	public Object practice6;
	public void practice1() {
		Scanner st = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int number = st.nextInt();

		if(number == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if(number == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(number == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(number == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(number == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("다시 입력해주세요");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요 : ");
		double num = sc.nextDouble();
		
		if(num > 0) {
			if(num % 2 ==0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int English = sc.nextInt();
		int sum = korean + math + English;
		double avg = sum / 3;
		if((korean >= 40 && math >= 40 && English >=40) && (avg >=60)) {
			System.out.println("국어 : "+korean);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+English);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		if(month == 1 || month == 2 || month == 12)
		{
			season = "겨울";
		} else if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			System.out.printf("%d월은 잘못 입력된 달입니다.",month);
			return;
		}
		System.out.printf("%d월은 %s입니다.",month,season);

		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String ID = sc.nextLine();
		System.out.print("비밀번호 : ");
		String Password = sc.nextLine();
		if(ID.equals("myId")) {
			if(Password.equals("myPassword12")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String proceed = sc.nextLine();
		if(proceed.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		}else if(proceed.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(proceed.equals("비회원")) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("다시 입력하세요.");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해 주세요 : ");
		double tall = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double BMI = weight /(tall*tall);
		System.out.println("BMI 지수 : "+BMI);
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI >=18.5 && BMI < 23) {
			System.out.println("정상체중");
	    }else if(BMI >=23 && BMI < 25) {
			System.out.println("과체중");
		}else if(BMI >= 25 && BMI <30) {
			System.out.println("비만");
		}
	    
	    else if(BMI >= 30) {
			System.out.println("고도 비만");
		}else {
			System.out.println("정상이 아닙니다. 다시 입력하세요.");
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) :");
		String sign = sc.next();
		if(num1 > 0 && num2 >0) {
			switch(sign) {
			case "+":
				System.out.printf("%d %s %d = %d",num1,sign,num2, (num1 + num2) );
				break;
			case "-":
				System.out.printf("%d %s %d = %d",num1,sign,num2, (num1 - num2) );
				break;
			case "*":
				System.out.printf("%d %s %d = %d",num1,sign,num2, (num1 * num2) );
				break;
			case "/":
				System.out.printf("%d %s %d = %f",num1,sign,num2, (double)(num1 / num2) );
				break;
			case "%":
				System.out.printf("%d %s %d = %f",num1,sign,num2, (num1 % num2) );
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int MiddleEx = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int FinalEx = sc.nextInt();
		System.out.print("과제 점수 : ");
		int Homework = sc.nextInt();
		System.out.print("출석 회수 : ");
		int date = sc.nextInt();
		System.out.println("============결과==============");
		double total = (MiddleEx*0.2) + (FinalEx * 0.3) + (Homework * 0.3) +date;
		if(date >14 && date <=20 && MiddleEx <= 100 && FinalEx <= 100 && Homework <= 100) {
			System.out.println("중간 고사 점수(20) : "+MiddleEx * 0.2);
			System.out.println("기말 고사 점수(30) : "+FinalEx * 0.3);
			System.out.println("과제 점수    (30) : "+Homework * 0.3);
			System.out.println("출석 점수    (20) : "+date );
			System.out.println("총점 : " + total);
			if(total >=70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
		}else if(date > 20) {
			System.out.printf("출석 일 수가 초과 되었습니다. 출석 일 수를 다시 입력하세요! " );
		}else if(MiddleEx > 100 && FinalEx >100 && Homework > 100) {
			System.out.println("점수가 100점 이상 초과되었습니다. 다시 입력 하세요!");
		}else {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]",date );
		}
	}
	public void practice11(){
		Scanner sc= new Scanner(System.in);
		System.out.println("비밀번호 입력 (1000~9999) : ");
		int number = sc.nextInt();
		if(number <10000 && number > 999) {
			int numberone = number / 1000;
	        int numbertwo = (number / 100)%10;
	        int numberthree = (number / 10)%10;
	        int numberfour = number % 10;
			if(numberone!=numbertwo&&numberone!=numberthree&&numberone!=numberfour&&numbertwo!=numberthree&&numbertwo!=numberfour&&numberthree!=numberfour) {
				System.out.println("성공");
			}else {
				System.out.println("중복된 값이 있습니다.");
			}
		}else {
			System.out.println("4자리수 초과 및 4자리수 미만");
		}
			
			
	}
}

