package com.kh.example.practice3.model.vo.Run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.setRadius(2);
        c.getAreaOfCircle();
        c.getSizeOfCircle();

        c.incrementRadius();

        c.getAreaOfCircle();
        c.getSizeOfCircle();

    }
}
