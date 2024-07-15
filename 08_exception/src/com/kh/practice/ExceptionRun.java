package com.kh.practice;

import java.util.InputMismatchException;


public class ExceptionRun {
    public static void main(String[] args) {
        exceptionTest1();
    }
    /*
    1. ArithmeticException, InputMismatchException
        사용자로부터 2개의 정수를 입력받고,
        첫번째 입력된 값이 두번째 입력된 값의 배수인지 확인해
        배수인 경우 "x는 x의 배수입니다." 출력
        배수가 아닌 경우 "x은 x의 배수가 아닙니다." 출력
        (프로그램이 정상적으로 종료될 수 있도록 시작지점에 "--start--"
                                          마지막지점에 "--end--"출력)
     */
    public static void exceptionTest1(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("-----start-----");
        try {
            System.out.print("첫번째 정수를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력하세요 :");
            int num2 = sc.nextInt();
            if(num1 % num2  == 0 && num1 != 0){
                System.out.println("배수입니다.");
            }else {
                System.out.println("배수가 아닙니다.");
            }
        }
        catch (ArithmeticException e){ // java.lang 경로에 있어 생략
            e.printStackTrace();
        }catch (InputMismatchException e){ // java.lang 경로에 있어 import 필요
            e.printStackTrace();
        }
        System.out.println("------end------");
    }
    /*
    NegativeArraySizeException, ArrayIndexOutOfBoundsException
    -5~5사이 난수를 발생시켜 하당 난수 크기로 배열 생성한 후
    1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력
    (프로그램이 정상적으로 종료되는것을 확인하기 위해 처음과 끝에 "start","end"출력)
     */
}
