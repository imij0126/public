package QASD;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.next();
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        //문자열의 길이 : 문자열_변수/값.length()
        //배열 길이 : 배열_변수/값.length
        char[] arrch = new char[str.length()];
        //입력받은 문자열을 배열에 문자 하나하나 저장 = >문자형 배열
        for(int i = 0;i<arrch.length;i++) {
            arrch[i] = str.charAt(i);
        // str.charAt(0) : a
        // str.charAt(1) : p
        // str.charAt(2) : p //각각 스페링 1개마다 인덱스에 저장
        }
        System.out.printf("%s에 %c 가 존재하는 위치(인덱스) : ", str,ch);
        int count = 0;
        for(int i = 0;i <arrch.length; i++) {
            if(arrch[i] == ch) {             // 문자형 배열의 1번째 값과 사용자가 입력한 문자값이 같다면,
                count++;			             // 개수 증가
                System.out.print(i + " ");   // 해당 위치의 인덱스 값을 출력!
            }
        }
        System.out.println();
        System.out.println(ch + "의 개수 : " +count);
    }
}
