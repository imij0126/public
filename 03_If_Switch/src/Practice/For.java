package Practice;

public class For {
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
	        for (int i = 2; i <= 9; i++) { // 구구단의 2단부터 9단까지 출력
	            System.out.print(i + "x" + j + "=" + (i * j) + "\t");
	        }
	        System.out.println(); // 각 곱해지는 수마다 줄 바꿈
	    }

	}
}
