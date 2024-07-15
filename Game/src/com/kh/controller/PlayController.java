package com.kh.controller;

import com.kh.model.vo.User;
import java.util.Scanner;

public class PlayController {
    private Scanner sc = new Scanner(System.in);
    private User user = new User("김인창");
    public void game01(){
        System.out.println("1~50사이 랜덤값 추출해 저장하고 사용자로부터\n정수 입력받은 뒤 랜덤값보다 크면 \"Down\" 출력, 작으면 \"up\"출력");
        int number = (int) (Math.random()*50+1);
        int count = 0;
        while (true) {
            if (count == 5) {
                System.out.println("5번의 기회가 종료되었습니다.");
                break;
            }
            System.out.print("숫자 입력 : ");
            count ++;
            int choose = sc.nextInt();
                if (choose == number){
                    System.out.println("정답!");
                    System.out.println("10점 획득");
                    user.setScore(user.getScore() + 10);
                    return;
                } else if (choose > number){
                    System.out.println("값이 틀립니다.");
                    System.out.println("down");
                } else {
                    System.out.println("값이 틀립니다.");
                    System.out.println("up");
                }

        }
    } // 1~50사이 랜덤값 추출해 저장하고 사용자로부터
                            //정수 입력받은 뒤
                            // 랜덤값보다 크면 "Down" 출력, 작으면 "up"출력
                            //같은값이면 "Catch" 출력 후 User에 점수 10점 추가(단,5번 기회 성공해야 점수 획득)
    public void game02(){
        System.out.println("가위바위보 게임");
        int count =0;
        while (true){
            int number = (int) (Math.random()*3+1);
            if (count == 5) {
                System.out.println("5번의 기회가 종료되었습니다.");
                break;
            }
            count++;
            System.out.print("당신이 낼 걸 선택하세요 : ");
            String finger = sc.nextLine();
            if (finger.equals("주먹")){
                if (number==1){
                    System.out.println("비겼습니다.");
                } else if (number == 2) {
                    System.out.println("이겼습니다.");
                    System.out.println("10점 획득");
                    user.setScore(user.getScore() + 10);
                    return;
                }else {
                    System.out.println("졌습니다. 다음 기회에");
                }
            } else if (finger.equals("가위")) {
                if (number==1){
                    System.out.println("졌습니다. 다음 기회에");
                } else if (number == 2) {
                    System.out.println("비겼습니다..");
                }else {
                    System.out.println("이겼습니다.");
                    System.out.println("10점 획득");
                    user.setScore(user.getScore() + 10);
                    return;
                }
            } else if (finger.equals("보")) {
                if (number==1){
                    System.out.println("이겼습니다.");
                    System.out.println("10점 획득");
                    user.setScore(user.getScore() + 10);
                    return;
                } else if (number == 2) {
                    System.out.println("졌습니다. 다음 기회에");
                }else {
                    System.out.println("비겼습니다.");
                }
            }
        }
    }
    public void game03(){
        System.out.println("블랙잭\n게임을 시작합니다.");
        int give_card1 = (int) (Math.random()*10+1);
        int give_card2 = (int)(Math.random()*10+1);
        int host_card1 = (int) (Math.random()*10+1);
        int host_card2 = (int) (Math.random()*10+1);
        int plus_card1 = (int) (Math.random()*10+1);
        int host_card3 = (int) (Math.random()*10+1);
        int host = host_card1+host_card2;
        int host_DD= host_card1+host_card2+host_card3;
        System.out.println("카드 두장을 줍니다. : "+give_card1+" "+give_card2);
        System.out.println("호스트 카드 한장을 보여 줍니다. : "+host_card1);
        while (true){
            if (give_card1+give_card2<21){
                System.out.print("히트 or 스탠드 아니면... 더블다운 : ");
                String choose = sc.nextLine();
                if (choose.equals("히트")){
                    System.out.println("뽑은 카드 : "+plus_card1);
                    int yp=give_card1+give_card2+plus_card1;
                    System.out.println("총 합 : "+yp);
                    if (yp > 21 || (yp<=host)){
                        System.out.println("호스트 두번째 카드 : " +host_card2);
                        System.out.println("버스트");
                        return;
                    }else {
                        System.out.println("이겼습니다.");
                        user.setScore(user.getScore() + 10);
                        return;
                    }
                } else if (choose.equals("스탠드")){
                    int yp1 = give_card1+give_card2;
                    System.out.println(yp1);
                    System.out.println("호스트의 두번째 카드 : "+host_card2);
                    if (yp1 < host){
                        System.out.println("버스트");
                    }else {
                        System.out.println("이겼습니다.");
                        user.setScore(user.getScore() + 10);
                        return;
                    }
                } else if (choose.equals("더블다운")){
                    System.out.println("뽑은 카드 : "+plus_card1);
                    int yp=give_card1+give_card2+plus_card1;
                    System.out.println("총 합 : "+yp);
                    System.out.println("호스트의 두번째 카드 : "+host_card2);
                    System.out.println("호스트가 카드 한장을 뽑습니다.");
                    System.out.println("호스트의 세번째 카드 : "+host_card3);
                    if ((host_DD >21) && (yp <21)){
                        System.out.println("호스트 버스트 당신의 승리!");
                        System.out.println("얻는 점수 20점");
                        user.setScore(user.getScore() + 10);
                        return;
                    }else if ((host_DD >21) && (yp >21)){
                        System.out.println("둘다 버스트 당신의 패배");
                        System.out.println("잃는 점수 -10점");
                    } else if ((21>host_DD) && (host_DD > yp)) {
                        System.out.println("호스트 승리");
                        System.out.println("잃는 점수 -10점");
                        return;
                    } else if ((host_DD<21)&&(host_DD<yp)) {
                        System.out.println("당신의 승리");
                        System.out.println("얻는 점수 20점");
                        user.setScore(user.getScore() + 10);
                        return;
                    }

                }
            }
        }
    }

    public void total(){
        System.out.println(user.toString());
    }
}
