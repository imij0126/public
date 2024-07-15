package com.kh.practice.charCheck.exception;

import com.kh.practice.charCheck.controller.CharacterController;

//예외클래스 : 특정 조건에 예외를 발생시킬 사용할 목적
public class CharCheckException extends Exception {
    public CharCheckException(){}
    public CharCheckException(String msg){
        // 문자열 : 예외처리 시 어떤 예외인지를 확인시켜주는 목적
        super (msg);
    }

}
