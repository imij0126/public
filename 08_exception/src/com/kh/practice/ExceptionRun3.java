package com.kh.practice;

import java.util.Scanner;

public class ExceptionRun3 {
    public static void main(String[] args) {
        System.out.println("-----Start-----");
        try {

            exceptionTest3();

        }catch (ValueLengthException e){
            e.printStackTrace();
            //        e.getMessage();
        }
    }
    public static void exceptionTest3() throws ValueLengthException {
        // 사용자에게 입력받은 값의 길이가 3 이하인 경우 예외를 발생시키기!
        Scanner sc =new Scanner(System.in);
        String value = sc.nextLine();

        //      value 변수 값의 길이가 3 이하인 경우 예외 발생!
        // * throw new 예외클래스명(); // 예외클래스 객체 생성
        // * 발생시킨 메소드 헤드부분에 throws 예외 클래스명 추가
        if (value.length() <=3){
            System.out.println("------- exception[1] --------");
            throw new ValueLengthException("입력된 길이가 3 이하입니다. 4글자 이상 입력하세요.");
        }
        System.out.println(value);
        System.out.println("------ end[2]-------");
    }
}
