package QASD;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in) ;
            System.out.println("행 크기 : ");
            int num1 = sc.nextInt();
            System.out.println("열 크기 : ");
            int num2 = sc.nextInt();
            if(num1 >11|| num1 <0 || num2 >11 || num2 <0){
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
                continue;
            }
            char [][]arr = new char[num1][num2];
            for (int i = 0;i<num1;i++){
                for (int j = 0;j<num2;j++){
                    arr[i][j] = (char)(int)(Math.random()*26+65);
                }
            }
            for(int i =0;i <arr.length;i++){
                for(int j = 0;j <arr[i].length;j++){
                    System.out.printf(arr[i][j]+" ");
                }
                System.out.println();
            }
            break;
        }
    }
}
