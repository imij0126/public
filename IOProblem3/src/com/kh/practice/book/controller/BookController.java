package com.kh.practice.book.controller;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;
import java.io.File;
import java.io.IOException;

public class BookController {
    private BookDAO bd = new BookDAO();
    public void makeFile(){
        // "book.txt" 를 매개변수로 받는 File 객체를 생성해
        File file = new File("book.txt");
        // book.txt 가 없다면 파일 생성 (exist createNewFile)
        if (!file.exists()){            // 해당 파일이 존재하는 지 체크
            try{
                file.createNewFile();   // 없다면, 파일을 생성
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void fileSave(Book[] bArr){
        bd.fileSave(bArr);
    }
    public Book[] fileRead(){
        // bd에 fileRead() 반환 값을 그대로 반환
        return bd.fileRead();
    }
}
