package com.kh.example.practice2.Run;

import com.kh.example.practice1.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setPrice(1000);
        p1.setName("사과");
        p1.setBrand("충주");
        p1.information();

        Product p2 = new Product();
        p2.setName("커피");
        p2.setBrand("스타벅스");
        p2.setPrice(3000);
        p2.information();

    }
}
