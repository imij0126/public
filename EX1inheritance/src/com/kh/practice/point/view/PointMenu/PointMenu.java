package com.kh.practice.point.view.PointMenu;

import com.kh.practice.point.controller.CricleController.CircleController;
import com.kh.practice.point.controller.RectangleController.RectangleController;

import java.util.Scanner;

public class PointMenu {
    private Scanner sc = new Scanner(System.in);
    private CircleController cc = new CircleController();
    private RectangleController rc = new RectangleController();

    //기본생성자는 자동으로 생성될 것!

    public void mainMenu(){
        while (true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 원");
            System.out.println("2. 사각형");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    circleMenu();
                    break;
                case 2:
                    rectangleMenu();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
    }
    public void circleMenu(){
        System.out.println("===== 원 메뉴 =====");
        System.out.println("1. 원 둘레 ");
        System.out.println("2. 원 넓이 ");
        System.out.println("9. 메인으로 ");
        System.out.print("메뉴 번호 : ");
        int menu1  =sc.nextInt();
        if (menu1 !=1&&menu1 !=2){
            System.out.println("메인으로 돌아갑니다.");
            return;
        }
        if(menu1 == 1){
            calcCircum();
        } else if (menu1 ==2) {
            calcCircleArea();
        } else if (menu1 ==9) {
            System.out.println("메인으로 돌아갑니다.");
            return;    // 현재 메소드에서 반복문이 실해되지 않으므로 굳이 사용하지 않아도 된다
        }else {
            System.out.println("잘못 입력했습니다. 메인으로 돌아갑니다.");
            return;
        }
    }
    public void rectangleMenu(){
        System.out.println("===== 사각형 메뉴 =====");
        System.out.println("1. 사각형 둘레 ");
        System.out.println("2. 사각형 넓이 ");
        System.out.println("9. 메인으로 ");
        System.out.print("메뉴 번호 : ");
        int menu2  =sc.nextInt();
        switch (menu2){
            case 1:
                calcPerimeter();
                break;
            case 2:
                calcRectArea();
                break;
            case 9:
                System.out.println("메뉴로 돌아갑니다.");
                return;
            default:
                System.out.println("다시 입력하세요.");
                return;
        }
    }
    public void calcCircum(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        System.out.println(cc.calcCircum(x,y,radius));
    }
    public void calcCircleArea(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        System.out.println(cc.calcArea(x,y,radius));
    }
    public void calcPerimeter(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int h = sc.nextInt();
        System.out.print("너비 : ");
        int w = sc.nextInt();
        System.out.println(rc.calcPerimeter(x,y,h,w));
    }
    public void calcRectArea(){
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();

        System.out.print("y 좌표 : ");
        int y = sc.nextInt();

        System.out.print("높이 : ");
        int h = sc.nextInt();

        System.out.print("너비 : ");
        int w = sc.nextInt();

        System.out.println(rc.calcArea(x,y,h,w));
    }
}
