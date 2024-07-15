package Com.kh.practice.chap02;

public class Practice {
	public void method1() {
		for(int i =1;i <11;i++) {
			System.out.print(i);
			if(i !=10) {
				System.out.println(" ");
		}
	  }
	}
	public void method2() {
		for(int i = 10; i > 0; i--) {
			System.out.print(i);
			if(i !=1) {
				System.out.print(" ");
			}
		}
	}
	public void method3() {
		int sum = 0;
		for(int i = 1; i <11;i++) {
			sum += i;
		}
		System.out.println("1부터 10까지 총 합 : "+sum);
	}
	public void method4() {
	 /* math : java.lang.math
		// * random() : 랜덤값을 반환해주는 메소드
		=> 사용법 : Math.random()
			값의 범위 : 0.0 ~ 0.9999xx (0.0 <= n <1.0 )
		=> 1 ~ 10 사이의 랜덤값
		: (int)(Math.random() * 10 +1)
		
	*/
	int random = (int)(Math.random() * 10 +1);
	System.out.println("랜덤값은 " + random + "입니다. ");
	//random 까지의 총합을 구하여 출력 (1~random)
	int total = 0;
	for(int i = 1; i <= random; i++) {
		total += i;
		
	}
	System.out.println("총 합은 : "+total);
	}
	public void method5() {
		// 분기문 : break (반복문 종료시키는 분기문)
		
		//1~100 사이의 랜덤값을 추출하여
		//해당 랜덤 값이 짝수일때 반복문 종료 (종료전 "종료" 출력).
		// 홀수일 때는 해당 값을 출력.
		while(true) {
			int random = (int)(Math.random() * 100 +1);
			if(random % 2 == 0) {
				System.out.println("종료 : " + random);
				break;
			}
			System.out.println("랜덤값 : " + random);
		}
	}
	public void method6() {
		//1부터 10 까지 정수 중에 짝수만 출력
		//continue : 반복문 내에 실행되면 뒤에 코드를 무시하고 증감식이나 조건식으로 이동
		for(int i = 1; i <= 10; i++) {
			if(i %2 == 0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
}

