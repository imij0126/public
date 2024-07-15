package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryController lc = new LibraryController();
    private Scanner sc = new Scanner(System.in);
    public void mainMenu(){
        while (true) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            Member m = new Member(name,age,gender);
            lc.insertMember(m);
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 ");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    Member mInfo = lc.myinfo();
                    System.out.println(mInfo/*.toString()*/);
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
    }
    public void selectAll(){
        Book[] blist = lc.selectAll();
        for (int i =0;i < blist.length;i++){
            System.out.println(i+"번 도서 : " +blist[i]);
        }
    }

    public void searchBook(){
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] sList = lc.searchBook(keyword);
        for(Book b : sList){
            if(b != null){
                System.out.println(b/*.toString()*/);
            }
        }
        /*
        for (int i =0; i<sList.length;i++){
            if (sList[i] != null){
                System.out.println(sList[i]);
            }
        }
        */
    }
    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lc.rentBook(index);
        if (result == 0){
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
        }

    }
}
