package com.kh.practice.numRange.view;

import com.kh.practice.numRange.exception.NumRangeException;
import com.kh.practice.numRange.controller.NumberController;

import java.util.Scanner;

public class NumberMenu {
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1 :  ");
        int num1 = sc.nextInt();
        System.out.println("정수 2 : ");
        int num2 = sc.nextInt();
        NumberController cc = new NumberController();

        try {
            boolean result = cc.checkDouble(num1,num2);
            System.out.printf("%s은(는) %s의 배수인가 ? %b",num1,num2,result);
        }
        catch (NumRangeException e){
            e.printStackTrace();
        }
    }
}
