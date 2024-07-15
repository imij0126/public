package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
    private int[] lotto = new int[6];
    {
        lotto = new int[6];

        for (int i =0;i<lotto.length;i++){
            //lotto 배열의 i번째 위치에 랜덤값(1~45)을 저장
            lotto[i] = (int)(Math.random()*45+1);
            for (int j = 0; j <i;j++){
                if (lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
    }
    public Lotto() {}
    public void information() {
        // 정보 출력 => 필드의 정보를 출력
        //Arrays.toString(배열명) : [값1, 값2, 값3]
        System.out.println(Arrays.toString(lotto));

        //향상된 for문/foreach 문 :배열의 첫번째 위치부터 마지막우치까지 순서대로 데이터에 접근
        //for (자료형 변수명 : 배열명) {} --> 자료형은 배열의 자료형과 일치해야함
        for (int num : lotto){
            System.out.print(num + ", ");
        }
        }

}
