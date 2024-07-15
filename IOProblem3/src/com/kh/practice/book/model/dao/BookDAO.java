package com.kh.practice.book.model.dao;

import com.kh.practice.book.model.vo.Book;

import java.io.*;

public class BookDAO {
    private Book[] bArr = new Book[10];

    public void fileSave(Book[] bArr) {
        //1. 스트림 객체 생성
        //2. 입력받을때(read), 출력할때(write)에 필요한 메소드 사용해 입출력 작업
        //3. 스트림 사용 완료(close) => try~with~resource문 사용 시 생략가능
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {
            // 향상된 FOR문 => FOR(배열아이템타입(자료형) 변수명 : 배열명)
            for (Book b : bArr) {
                if (b != null) {
                    oos.writeObject(b);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Book[] fileRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Book.txt"))) {
            int index = 0;
            while (true) {
                //   try {
                Book b = (Book) ois.readObject();
                bArr[index++] = b;
                // }catch(EOFException e){
                //    break;      // EOFException 예외 발생 시 반복문 종료 그리고 e.printStackTrace를 쓰지 않으면
                // 예외처리 문구가 뜨지 않는다.
                // }catch (ClassNotFoundException e){
                //     e.printStackTrace();
                //  }
                // }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("11111");
            // 예외처리 문구가 뜨지 않는다.
        } catch (EOFException e) {
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bArr;
    }
}
