package com.kh.practice.list.library.view;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();
    public void mainMenu(){
        while (true) {
            System.out.println("===== Welcome KH Library =====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 입력 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
    }
    public void insertBook(){
        System.out.print("도서명: ");
        String title = sc.nextLine();
        System.out.print("저자명: ");
        String author = sc.nextLine();
        System.out.print("장르(1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타): ");
        int categoryChoice = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        String category;
        switch (categoryChoice) {
            case 1:
                category = "인문";
                break;
            case 2:
                category = "자연과학";
                break;
            case 3:
                category = "의료";
                break;
            case 4:
                category = "기타";
                break;
            default:
                category = "기타";
                System.out.println("잘못된 입력입니다. 기타로 설정됩니다.");
        }
        System.out.println("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        Book b = new Book(title,author,category,price);
        bc.insertBook(b);
    }
    public void selectList(){
        ArrayList<Book> bookList = bc.selectList();
        if (bookList.isEmpty()){
            System.out.println("존재하는 도서가 없습니다.");
        }else {
            for (Book book : bookList){
                System.out.println(book);
            }
        }
    }
    public void searchBook(){
        System.out.print("검색할 도서명 키워드 : ");
        String keyword = sc.nextLine();
        ArrayList<Book> searchList = bc.searchBook(keyword);
        if (searchList.isEmpty()){
            System.out.println("검색 결과가 없습니다.");
        }else {
            for (Book book : searchList){
                System.out.println(book);
            }
        }

    }
    public void deleteBook(){
        System.out.println("삭제할 도서 명 : ");
        String title = sc.nextLine();
        System.out.println("삭제할 저자 명 : ");
        String author = sc.nextLine();
        Book del = bc.deleteBook(title,author);
        if (del != null){
            System.out.println("성공적으로 삭제 되었습니다.");
        }else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }
    public void ascBook(){
        int result = bc.ascBook();
        if (result == 1){
            System.out.println("정렬에 성공하였습니다.");
        }else {
            System.out.println("정렬에 실패하였습니다.");
        }
    }
}
