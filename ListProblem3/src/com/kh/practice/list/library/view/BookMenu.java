package com.kh.practice.list.library.view;

import com.kh.practice.list.library.contorller.BookController;
import com.kh.practice.list.library.model.vo.Book;
import java.util.ArrayList;
import java.util.Scanner;

//화면(view)용 클래스 --> 사용자에게 데이터를 표시하거나 입력을 받는 역할
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
            sc.nextLine(); // 개행 문자 제거 \n 값이 남아있어 제거하기 위해 사용
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
                    return;     // 메소드 종료 --> 현재 메소드를 호출한 위치로 돌아감!
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    break;
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
        System.out.print("가격 : ");
        int price = sc.nextInt();
        String category = "";
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
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                return;
        }
        Book newBook = new Book(title,author,category,price);
        // * 배열을 사용한다면..
        // String[] categories = {"인문","자연과학","의료","기타"};
        //Book newBook2 = new Book(title,author,categories[categoryChoice-1],price);
        //String categories = "인문,자연과학,의료,기타";
        //Book b3 = new Book(title,author,categories.split(",")[categoryChoice-1],price);
        bc.insertBook(newBook);
        System.out.println("도서 추가 완료 !");
    }
    public void selectList(){
        ArrayList <Book> booklist = bc.selectList();
        if (booklist.isEmpty()){
            System.out.println("존재하는 도서가 없습니다.");
        }else {
            //for (Book book : booklist){
            //   System.out.println(book);
            //}
            for (int i = 0; i <booklist.size();i++){    // size() : 리스트의 저장된 데이터 길이
                System.out.println(booklist.get(i)/*.toString()이 생략되어 있다.*/); // get(index) : 해당 index 위치의 데이터 조회
            }
        }
    }
    public void searchBook(){
        System.out.print("찾을 책을 검색하세요 : ");
        String keyword = sc.nextLine();
        ArrayList <Book> search = bc.searchBook(keyword);
        if (search.isEmpty()){
            System.out.println("검색 결과 없습니다.");
        }else {
            for (Book book : search){
                System.out.println(book);
            }
        }
    }
    public void deleteBook(){
        System.out.print("삭제할 도서명 : ");
        String title = sc.nextLine();
        System.out.print("삭제할 저자명 : ");
        String author = sc.nextLine();
        Book remove = bc.deleteBook(title,author);
        if (remove != null){
            System.out.println("성공적으로 삭제되었습니다.");
        }else {
            System.out.println("삭제할 도서를 찾지 못했어");
        }
    }
    public void ascBook(){
        //컨트롤러의 ascBook() 메소드 결과에 따라
        //
        int result = bc.ascBook();
        if (result == 1) {
            System.out.println("정렬에 성공하였습니다.");
        } else {
            System.out.println("정렬에 실패하였습니다.");
        }
    }
}
