package com.kh.practice.chap01_poly.run;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.CookBook;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        AniBook[] ani = new AniBook[5];
        ani[0] = new AniBook("boonducks","bk","sony",19);
        ani[1] = new AniBook("Hazbin Hotel","vizipop","amazon",19);
        ani[2] = new AniBook("bocchi the rock","bocchi","homunsa",15);
        ani[3] = new AniBook("Spiderman universe","peter","sony",12);
        ani[4] = new AniBook("murder drone","unknown","glitch",19);

        CookBook[] cooklist = {
                new CookBook("백종원의 집밥","백종원","tvN",true),
                new CookBook("국종원의 집밥","성시경","tvN",false),
                new CookBook("삼종원의 집밥","이혜정","tvN",true),
                new CookBook("길종원의 집밥","최현석","tvN",true),
                new CookBook("호종원의 집밥","임지선","tvN",false),
        };
        // 사용자에게 책 제목을 입력받아 책 정보를 조회해보자.
        Scanner sc= new Scanner(System.in);
        System.out.print("조회하고자 하는 책 제목 입력 : ");
        String title = sc.nextLine();

        boolean found = false;
        for (int i =0; i< ani.length;i++){
            if (ani[i].getTitle().equals(title)){
                System.out.println(ani[i].toSpring());
                found = true;
                break;
            }
        }
        if (!found){  // 못 찾았을 경우
            //요리책 목록에서 찾아보기.
            for (int i =0;i<cooklist.length;i++){
                if (cooklist[i].getTitle().equals(title)){
                    System.out.println(cooklist[i].toString());
                    found = true;
                    break;
                }
            }
        }
    }
}
