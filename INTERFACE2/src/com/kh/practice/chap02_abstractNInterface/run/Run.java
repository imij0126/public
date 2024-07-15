package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;

public class Run {
    public static void main(String[] args) {
        PhoneController pc = new PhoneController();
        String[] r = pc.method();
        //String []r=pc.method();
        for (int i = 0;i<r.length;i++){
            System.out.println(r[i]);
            System.out.println("++++++++++++++++++++++");
        }
        /*
        for(String info : r){
                System.out.println(info);
         */
    }
}
