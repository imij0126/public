package Array;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        String[] students = {
                "강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
                "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
        };

        // 2차원 배열로 분단 나누기
        String[][] class1 = new String[3][2];
        String[][] class2 = new String[3][2];

        // 학생 이름 분배
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                class1[i][j] = students[index++];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                class2[i][j] = students[index++];
            }
        }

        // 1분단 출력
        System.out.println("== 1분단 ==");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(class1[i][j] + " ");
            }
            System.out.println();
        }

        // 2분단 출력
        System.out.println("== 2분단 ==");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(class2[i][j] + " ");
            }
            System.out.println();
        }

        // 학생 자리 검색
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.print("검색할 학생 이름을 입력하세요: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (class1[i][j].equals(searchName)) {
                    System.out.println("검색하신 " + searchName + " 학생은 1분단 " + (i + 1) + "번째 줄 " + (j == 0 ? "왼쪽" : "오른쪽") + "에 있습니다.");
                    found = true;
                }
                if (class2[i][j].equals(searchName)) {
                    System.out.println("검색하신 " + searchName + " 학생은 2분단 " + (i + 1) + "번째 줄 " + (j == 0 ? "왼쪽" : "오른쪽") + "에 있습니다.");
                    found = true;
                }
            }
        }
    }
}
