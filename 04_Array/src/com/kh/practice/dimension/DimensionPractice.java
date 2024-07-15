package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		// 1. 3행 3열짜리 문자열 배열 선언 및 할당
		String[][] arr = new String[3][3];
		// 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0,0)" 형식으로 값을 저장
		for(int i = 0; i<arr.length;i++) { //행의 인덱스로 사용
			
			// arr[i].length => 1차원 배열의 길이. 즉,열의 길이
			// arr[i] 는 문자열 데이터를 담고있는 배열이다!
			
			for(int j=0;j<arr[i].length;j++) { //j열의 인덱스 사용
				// arr[i][j] 는 문자열 데이터다!
				arr[i][j] = "(" + i +", " + j +")";
			}
		}
		// 3. 저장된 값들을 출력
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
		int[][]arr = new int[4][4];
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] +=j+1+(i*4);
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void practice3() {
		int [][]arr =new int[4][4];
		for(int i = 3;i>=0;i--) {
			for(int j =3;j>=0;j--) {
				arr[j][i] += 17-(i+1+(j*4));
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
		int [][]arr= new int[4][4];
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {	
				int lastRow = arr.length-1; 	//마지막 행의 인덱스
				int lastcol = arr[i].length-1;  //마지막 열의 인덱스
				if(i != lastRow && j != lastcol) {
					arr[i][j] = (int)(arr[i][j] = (int)(Math.random()*10+1));
				}

				if(i == 3 && j!=3) {
					arr[3][j] = arr[2][j]+arr[1][j]+arr[0][j];
				}else if(i != 3 && j == 3) {
					arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
				}else if(i == 3 && j == 3) {
					arr[3][3] = arr[2][j]+arr[1][j]+arr[0][j]+arr[i][0]+arr[i][1]+arr[i][2];
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice5() {
		while(true) {
            Scanner sc = new Scanner(System.in) ;
            System.out.print("행 크기 : ");
            int num1 = sc.nextInt();
            System.out.print("열 크기 : ");
            int num2 = sc.nextInt();
            if(num1 >11|| num1 <0 || num2 >11 || num2 <0){
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
                continue;
            }
            char [][]arr = new char[num1][num2];
            for (int i = 0;i<num1;i++){
                for (int j = 0;j<num2;j++){
                    arr[i][j] = (char)(int)(Math.random()*26+65);//65~90까지의 랜덤값 => Math.random() * (최댓값 - 최솟값 +1) + 최솟값
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
	public void practice6() {
		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"},{"차","지","습","으","냅"},{"원","열","니","로","시"},{"배","심","다","좀","다"},{"열","히","!","더","!!"}};
		for(int i = 0;i<strArr.length;i++) {
			for(int j =0;j<strArr[i].length;j++) {
				System.out.print(strArr[j][i]+" ");
			}
			System.out.println();
		}
	}
	public void practice7() {
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
	public void practice8() {
		
	}
}