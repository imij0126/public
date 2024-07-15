package com.kh.hw.shape.view;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

import java.awt.*;
import java.util.Scanner;

public class ShapeMenu {
    private Scanner sc = new Scanner(System.in);
    private SquareController scr = new SquareController();
    private TriangleController tc = new TriangleController();
    public void inputMenu(){
        while (true) {
            System.out.println("===== 도형 프로그램 =====");
            System.out.println("3. 삼각형");
            System.out.println("4. 사각형");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();
            switch (menu){
                case 3:
                    triangleMenu();
                    break;
                case 4:
                    squareMenu();
                    break;
                case 9:
                    System.out.println("프로그램 종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
    }
    public void triangleMenu(){
        System.out.println("1. 삼각형 면적 ");
        System.out.println("2. 삼각형 색칠");
        System.out.println("3. 삼각형 정보");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 :");
        int menu1 = sc.nextInt();
        switch (menu1){
            case 1:
                inputSize(3,1);
                break;
            case 2:
                inputSize(3,2);
                break;
            case 3:
                printinformation();
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.");
                return;
            default:
                System.out.println("다시 입력하세요.");

        }
    }
    public void squareMenu(){
        System.out.println("1. 사각형 둘레");
        System.out.println("2. 사각형 면적");
        System.out.println("3. 사각형 색칠");
        System.out.println("4. 사각형 정보");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        int menu2 = sc.nextInt();
        switch (menu2){
            case 1:
                inputSize(4,1);
                break;
            case 2:
                inputSize(4,2);
                break;
            case 3:
                inputSize(4,3);
                break;
            case 4:
                printinformation();
                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.");
                return;
            default:
                System.out.println("다시 입력하세요.");
        }
    }
    public void inputSize(int type,int menuNum){
        if (type == 3 && menuNum == 1){
            System.out.print("높이 : ");
            int h = sc.nextInt();
            System.out.print("너비 : ");
            int w = sc.nextInt();
            System.out.println("삼각형 면적 : " + (w*h)/2);
        } else if (type == 3 && menuNum == 2) {
            System.out.print("색깔을 입력하세요 : ");
            tc.paintColor(Color);
            System.out.println("색이 수정되었습니다.");
        } else if ((type ==4 && menuNum == 1)||(type ==4&&menuNum==2)) {
            System.out.print("높이 : ");
            int h = sc.nextInt();
            System.out.print("너비 : ");
            int w = sc.nextInt();
            if (menuNum == 1){
                System.out.println("사각형 둘레 : "+(w*2)+(h*2));
            }else {
                System.out.println("사각형 면적 : "+w*h);
            }
        } else if (type==4 && menuNum==3) {
            System.out.print("색깔을 입력하세요 : ");
            scr.paintColor(Color);
            System.out.println("색이 수정되었습니다.");
        }
    }
    public void printinformation(){

    }
}
