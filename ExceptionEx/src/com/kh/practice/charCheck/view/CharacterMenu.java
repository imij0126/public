package com.kh.practice.charCheck.view;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;
import java.util.Scanner;

public class CharacterMenu {
    public void menu(){
        Scanner sc = new Scanner(System.in);
        CharacterController cc = new CharacterController();
        try {
            System.out.print("문자열 : ");
            String str = sc.nextLine();
            int count = cc.countAlpha(str);
            System.out.printf("'%s'에 포함된 영문자 개수 : %d\n",str,count);
        }catch (CharCheckException e){
            // 이 때 countAlpha()메소드를 호출하는 부분부터 try~catch
            e.printStackTrace();
        }
    }
}
