package com.kh.practice.book.view;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();
    private Book[] bArr;
    public BookMenu(){
        //파일이 없을때 만들어주기 위해 BookController(bc)에 makeFile() 호출
        bc.makeFile();
        // 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
        bArr = bc.fileRead();
    }
    public void mainMenu() {
        while (true) {
            System.out.println("1. 도서 추가 저장");
            System.out.println("2. 저장 도서 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("9. 프로그램 끝내기");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    fileSave();
                    break;
                case 2:
                    fileRead();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
    public void fileSave(){
        System.out.print("도서 명 : ");
        String title = sc.nextLine();
        sc.nextLine();
        System.out.print("저자 명 : ");
        String author = sc.nextLine();
        System.out.print("도서 가격 : ");
        int price = sc.nextInt();       // 2000\n ---> 2000 :: 버퍼에는 \n 이 남아있음!

        sc.nextLine();                  //
        System.out.print("출판 날짜(yyyy-mm-dd) : ");
        String date = sc.nextLine();
        System.out.print("할인율 : ");
        double discountRate = sc.nextDouble();
        sc.nextLine();
        // set(int year, int month, int date)
        // 비어있는 Book객체 배열에 담아 bc에 fileSave()에 매개변수 전달 --> null 체크 후 저장
        String [] dItem = date.split("-");
        // Calendar cal = new
        Calendar cal = Calendar.getInstance(); // => getInstance
        cal.set(Integer.parseInt(dItem[0])//문자열을 정수값으로 변경
                ,Integer.parseInt(dItem[1])-1,//calendar 클래스도 월 데이터를 0부터 처리
                Integer.parseInt(dItem[2]));
        //Book 객체에 담기 ---> 데이터를 사용해 BOOK 객체 생성
        Book b = new Book(title,author,price,cal,discountRate);                            // => 문자열의 값을 정수형의 값으로 변환
        for (int i=0;i<bArr.length;i++){
            //비어있는 배열 객체 --> 해당 index위치의 값이 null인지 확인!
            if(bArr[i] == null){
                bArr[i] = b;
                break;
            }
        }
        bc.fileSave(bArr);
    }
    public void fileRead(){
        //bc에 fileRead() 의 반환 값을 가지고 저장된 데이터 출력
        Book[] bList =  bc.fileRead();
        for (Book b : bList){
            if (b != null){
                System.out.println(b/*.toString()*/);
            }
        }
    }
    public void fileDelete(){

    }
}