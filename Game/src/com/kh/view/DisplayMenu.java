package com.kh.view;

import com.kh.controller.PlayController;
import java.util.Scanner;

public class DisplayMenu {
    private Scanner sc =new Scanner(System.in);
    private PlayController pc = new PlayController();
    public void mainMenu(){
        while (true) {
            System.out.println("=======Console Game========");
            System.out.println("1. Up & Down");
            System.out.println("2. 가위바위보");
            System.out.println("3. 블랙잭");
            System.out.println("9. 점수 조회");
            System.out.println("0. 게임 종료");
            System.out.print("게임 선택 : ");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    pc.game01();
                    break;
                case 2:
                    pc.game02();
                    break;
                case 3:
                    pc.game03();
                    break;
                case 9:
                    pc.total();
                    break;
                case 0:
                    System.out.println("게임 종료!");
                    return;
                default:
                    System.out.println("다시 입력하세요. ");
            }
        }
    }
}
