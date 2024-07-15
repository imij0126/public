package com.kh.practice.score.view;

import com.kh.practice.score.controller.ScoreController;

import java.util.Scanner;

public class ScoreMenu {
    private Scanner sc = new Scanner(System.in);
    private ScoreController scr = new ScoreController();
    public void mainMenu(){
        while (true) {
            System.out.println("1. 성적 저장");
            System.out.println("2. 성적 출력 ");
            System.out.println("9. 끝내기");
            System.out.println("메뉴 버튼 : 1");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    saveScore();
                    break;
                case 2:
                    readScore();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력하세요");
            }
        }
    }
    public void saveScore(){
        int num =0;
    }
    public void readScore(){

    }
}
