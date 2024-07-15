package QASD;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []menu = {"양념","불닭","치즈","황금올리브","마라","간장","파닭"};
        System.out.print("치킨 이름을 입력하세요 : ");
        String name = sc.nextLine();
        if(menu.equals(name)) {
            System.out.printf("%s치킨 배달 가능",name);
        }else {
            System.out.printf("%s치킨은 없습니다.",name);
        }

    }
}
