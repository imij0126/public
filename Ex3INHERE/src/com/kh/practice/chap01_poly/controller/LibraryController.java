package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
    private Member mem;
    private Book[] blist = new Book[5];
    // 생성자부 :생략
    // 메소드부
    // Member 타입으로 선언된 mem 이라는 필드의 setter 메소드 역할
    {
        blist[0] = new AniBook("Hazbin Hotel", "vizipop", "amazon", 19);
        blist[1] = new AniBook("bocchi the rock", "bocchi", "homunsa", 15);
        blist[2] = new AniBook("Spiderman universe", "peter", "sony", 12);
        blist[3] = new AniBook("murder drone", "unknown", "glitch", 19);
        blist[4] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
    }
    public void insertMember(Member mem){
        this.mem=mem;
    } // Member 타입으로 선언된 mem이라는 필드의 getter의 메소드 역할
    public Member myinfo(){
        // 회원 레퍼런스(mem) 주소 값 리턴
        return mem;
    }//Book[]로 선언된
    public Book[] selectAll(){
        return blist;
    }
    public Book[] searchBook(String keyword){
        Book[] searchList = new Book[5];
        int count = 0;
        for (int i = 0;i< blist.length;i++){
            if (blist[i].getTitle().contains(keyword)){
                searchList[count] = blist[i];   //keyword 포함된 제목인 도서 객체의 주소 할당
                count++;
            }
        }
        return searchList;
    }
    public int rentBook(int index){
        int result = 0;
        if (blist[index] instanceof AniBook){
            AniBook b =((AniBook)blist[index]);
            if (b.getAccessAge() > mem.getAge()){
                result = 1;
            }
        }else if(blist[index] instanceof  CookBook){
            CookBook c = ((CookBook)blist[index]);
            if (c.isCoupon()){
                // => 기존에 저장된 couponCount 값에 1 추가해 다시 저장
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }
        return result;
    }
}
