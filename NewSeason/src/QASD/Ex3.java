package QASD;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("주민등록번호(-포함) : ");
            String num = sc.next();
            if (num.length() > 14) {
                System.out.println("다시 입력하세요.");
                continue;
            }
            char[] arr = new char[num.length()];
            if(num.length()>=8) {
                for (int i = 14; i >= 8; i--) {
                    arr[i] = '*';
                }
            }
            System.out.println(arr);

        }
    }
}
