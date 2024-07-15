package QASD;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
            int num2 = sc.nextInt();
            arr[i] =num2;
            sum+=num2;
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
