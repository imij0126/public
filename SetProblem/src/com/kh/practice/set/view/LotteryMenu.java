package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
    private Scanner sc = new Scanner(System.in);
    private LotteryController lc = new LotteryController();

    public void mainMenu() {
        while (true) {
            System.out.println("========== KH 추첨 프로그램 ==========");
            System.out.println("1. 추첨 대상 추가");
            System.out.println("2. 추첨 대상 삭제");
            System.out.println("3. 당첨 대상 확인");
            System.out.println("4. 정렬된 당첨 대상 확인");
            System.out.println("5. 당첨 대상 검색");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            switch (choice) {
                case 1: insertObject(); break;
                case 2: deleteObject(); break;
                case 3: winObject(); break;
                case 4: sortedWinObject(); break;
                case 5: searchWinner(); break;
                case 9: System.out.println("프로그램 종료.");return;
                default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");break;
            }
        }
    }
    /*
        추첨 대상 추가용 메소드
     */
    public void insertObject() {
        System.out.print("추가할 추첨 대상 수: ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("추첨자 이름: ");
            String name = sc.nextLine();
            System.out.print("추첨자 핸드폰 번호: ");
            String phone = sc.nextLine();
            Lottery lottery = new Lottery(name, phone);
            boolean result = lc.insertObject(lottery);
            if(!result){
                System.out.println("중복된 값입니다. 다시 입력하세요");
                i--;
            }
        }
        System.out.println(count+" 명 추가 완료되었습니다.");
    }

    public void deleteObject() {
        System.out.print("삭제할 추첨자 이름: ");
        String name = sc.nextLine();
        System.out.print("삭제할 추첨자 핸드폰 번호: ");
        String phone = sc.nextLine();
        Lottery lottery = new Lottery(name, phone);

        if (!lc.deleteObject(lottery)) {
            System.out.println("존재하지 않는 대상입니다.");
        }
        System.out.println("삭제 완료 되었습니다.");
    }

    public void winObject() {
        System.out.println(lc.winObject()); // 결과...?
    }
    /*
        정렬된 당첨 대상 확인
     */
    public void sortedWinObject() {
        System.out.println(lc.sortedWinObject());
        // 컨트롤러에서 받아온 Set 객체를 Iterator 를 통해 출력
        //TreeSet<Lottery>lSet = lc.sortedWinObject();
        // 1) Iterator 객체 생성
        //Iterator<Lottery> it = lSet.iterator();
        // 2) 데이터 유/무 확인 (by. Iterator 객체)
        //while (it.hasNext()){
            // 3) 데이터 조회 (by. Iterator 객체)
        //    Lottery l = it.next();
         //   System.out.println(l);
        //}
    }
    /*
        당첨 대상 검색용 메소드
     */

    public void searchWinner() {
        // 검색 대상 이름, 핸드폰 번호를 입력받아
        // 매개변수 있는 생성자를 사용해 객체 생성
        // 컨트롤러에게 전달 후 결과에 따라 출력
        System.out.print("검색할 추첨자 이름: ");
        String name = sc.nextLine();
        System.out.print("검색할 추첨자 핸드폰 번호: ");
        String phone = sc.nextLine();
        Lottery lottery = new Lottery(name, phone);
        boolean result = lc.searchWinner(lottery);
        if (result) {
            System.out.println("축하합니다. 당첨 목록에 존재합니다.");
        } else {
            System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
        }
    }
}
