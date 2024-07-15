package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
        private String[] result = new String[2];
        public String[] method(){
            Phone[] phoneList = new Phone[2];
            // 각각의 인덱스에 다형성을 적용해 GalaxyNote9,V40 객체 저장
            phoneList[0] = new GalaxyNote9();
            phoneList[1] = new V40();
            //for문 이용해 Phone 객체배열에 각 인덱스의 printInformaion()의 반환
            //값을 String 배열에 담아 반환
            int index = 0;
            for (int i =0;i< phoneList.length;i++){
                /*
                instanceof 활용하기
                이때 참조한 객체 타입 gal인 경우 gal에 오버라이딩된 printInfomr호출
                v40이면 printInform호출
                 */
                if (phoneList[i] instanceof GalaxyNote9){
                    result[index++]=((GalaxyNote9)phoneList[i]).printInformation();
                } else if (phoneList[i] instanceof V40) {
                    result[index++]=((V40)phoneList[i]).printInformation();
                }
            }
            return result;
        }
}
