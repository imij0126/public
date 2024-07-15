package com.kh.example.practice6.model.vo.Run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {
        Book B1 = new Book("호러","새롬","가일검");
        Book B2 = new Book("액션","풀무원","금강",20000,30);
        Book B3 = new Book("삼국지", "진수","나관중",50000,30);
        B1.inform();
        B2.inform();
        B3.inform();
    }
}
