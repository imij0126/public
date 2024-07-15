package QASD;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행의 크기 : ");
        int row = sc.nextInt();

        // 열의 크기가 다른 2차원 배열 선언 및 할당
        int[][] arr = new int[row][];
        char value = 'a';
        for(int i=0;i<row;i++){
            System.out.print(i+"행의 열 크기 : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
            for (int j =0;j<col;j++){
                arr[i][j] = value++;
            }
        }
        for(int i =0;i <arr.length;i++){
            for(int j = 0;j <arr[i].length;j++){
                System.out.printf((char)arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
