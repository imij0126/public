package com.kh.practice;

import java.io.*;

public class IO03_CopyOfBuffered {
    public static void main(String[] args) {
        // BufferedInputStream과 BufferedOutputStream을 이용해
        // resources/src,txt ====> resources/dst.txt 복사

        File src = new File(".\\resource\\src");
        File dst = new File(".\\resource\\dst");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        // 입출력 스트림 객체 선언
        // 입출력 데이터 관련 변수 선언
        byte[] buf = new byte[1024];
        int len = -1;
        int total = 0;      // 총 입출력 길이 저장을 위한 변수

        try {
            bis = new BufferedInputStream(new FileInputStream(src));
            bos = new BufferedOutputStream(new FileOutputStream(dst));
            // 파일 입출력 스트림 생성
            while ((len = bis.read(buf)) != -1){        // 파일 입력(데이터를 읽어오기
                bos.write(buf,0,len);               // 파일 출력(데이터 쓰기)
                bos.flush();

                total += len;
            }
            // 파일 입력 및 출력 (파일 복사)
        }catch (FileNotFoundException e){
            System.out.println("[ERROR] 알수없는 파일!");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("[ERROR] 입출력 작업 실패!");
            e.printStackTrace();
        }finally {
            try{
                if(bis != null) bis.close();
                if(bos != null) bos.close();
            }catch (IOException e){
                System.out.println("[ERROR]스트림 객체 반납 실패! ");
                e.printStackTrace();
            }
        }
        // 복사된 총 파일 길이 출력
        System.out.println("복사 완료 : 총길이 ="+total);
    }
}
