package SUBJECT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if ((num1 == num2)&&(num2==num3)){
            System.out.println((num1*1000)+10000);
        } else if ((num1 == num2)||(num1==num3)||(num2==num3)) {
            if (num1 == num2){
                System.out.println(num1*100 +1000);
            } else if (num1 == num3) {
                System.out.println(num1*100+1000);
            } else if (num2 == num3) {
                System.out.println(num2*100+1000);
            }
        } else {
            int maxNum = Math.max(Math.max(num1, num2), num3);
            System.out.println(maxNum*100);
        }
    }
}