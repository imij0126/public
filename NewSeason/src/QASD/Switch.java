package QASD;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12월 까지 원하는 월을 입력하세요 : ");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("%d월의 마지막 날은 31일 입니다.",month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("%d월의 마지막 날은 30일 입니다.",month);
                break;
            case 2:
                System.out.printf("%d월의 마지막 날은 28일 입니다.",month);
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
        }
    }
}
