package GameMenu;

import GameController.GameController;

import java.util.Scanner;

public class GameMenu {
    private Scanner sc = new Scanner(System.in);
    private GameController gc = new GameController();
    public void mainMenu(){
        while (true) {
            System.out.println("게임 선택 도우미에 어서오세요!!!");
            System.out.println("원하시는 걸 선택하세요");
            System.out.println("1. 밸브 개발 게임 ");
            System.out.println("2. 스팀에 서비스 되는 게임");
            System.out.println("3. 스팀이 아닌 게임(스위치, 플레이스테이션)");
            System.out.println("4. 게임 검색 및 추가");
            System.out.println("5. 게임 삭제");
            System.out.println("9. 프로그램 종료");
            int menu = sc.nextInt();
            switch (menu){
                case 1: SteamDevlMenu();break;
                case 2: SteamOtherMenu();break;
                case 3: OtherMenu();break;
                case 4: addGameMenu();break;
                case 5: removeGameMenu();break;
                case 9: System.out.println("프로그램을 종료합니다.");return;
                default: System.out.println("다시 입력하세요");
            }
        }
    }
    public void SteamDevlMenu(){
        System.out.println("밸브 개발 게임");
    }
    public void SteamOtherMenu(){}
    public void OtherMenu(){}
    public void addGameMenu(){}
    public void removeGameMenu(){}
}
