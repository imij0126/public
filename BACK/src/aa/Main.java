package aa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 영수증에 적힌 총 금액 입력
        int X = scanner.nextInt();

        // 물건의 종류 수 입력
        int N = scanner.nextInt();

        // 계산된 총 금액 초기화
        int calculatedTotal = 0;

        // 각 물건의 가격과 개수를 입력받아 계산
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            calculatedTotal += a * b;
        }

        // 계산된 총 금액이 영수증의 총 금액과 동일한지 확인
        if (calculatedTotal == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
