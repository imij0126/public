package com.kh.practice;

import java.util.Scanner;

public class ExceptionRun2 {
    public static void main(String[] args) {
        exceptionTest2();
    }
    /*
    NegativeArraySizeException, ArrayIndexOutOfBoundsException
    -5~5사이 난수를 발생시켜 하당 난수 크기로 배열 생성한 후
    1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력
    (프로그램이 정상적으로 종료되는것을 확인하기 위해 처음과 끝에 "start","end"출력)
     */
    public static void exceptionTest2(){
        System.out.println("start");
        try {
            int num = (int)(Math.random()*11-5);
            int [] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
            }
        }
        catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("end");
    }
    /* 사용자정의예외클래스 만들기
        - exception 클래스 상속
        - 생성자 (기본 / 매개변수 1개 -> msg.String)
        -
        사용자에게 입력받은 값의 길이가 3 이하인 경우 예외를 발생시키기;
        - 클래스명 : ValueLengthException
        - main 메소드에서 예외처리
     */
}
