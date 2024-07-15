package QASD;

import java.util.Scanner;

public class if_Switc_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 14자리를 입력하세요. : ");
        String num = sc.nextLine();
        if(num.length() == 14 ){
            if(num.charAt(7) == '1'){
                System.out.println("남자입니다.");
            }else if(num.charAt(7) == '2'){
                System.out.println("여자입니다.");
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }else {
            System.out.println("주민번호를 초과하셨습니다. 다시 입력해주세요.");
        }
    }
}
