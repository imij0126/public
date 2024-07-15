package com.kh.practice.token.controller;

import com.kh.practice.token.view.TokenMenu;
import com.kh.practice.token.controller.TokenController;
import java.util.StringTokenizer;

public class TokenController {
    public TokenController(){}
    public String afterToken(String str){
        //매개변수로 받아온 str을 StringTokenizer를 이용해
        //띄어쓰기를 없애고 없앤 문자열 반환
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb =new StringBuilder();
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            sb.append(token);
        }
        return sb.toString();
    }
    public String firstCap (String input){
        // 매개변수로 받아온 input의 첫번째 글자만 대문자로 바꾼 문자열 반환
        String subStr = input.substring(0,1); // 2번째 글자부터 마지막까지

        return subStr.toUpperCase() + input.substring(1);
    }
    public int findChar(String input, char one){
        int count = 0;
        for (int i =0;i<input.length();i++){
            if(input.charAt(i) == one){
                count++;
            }
        }
        return count;
    }
}
