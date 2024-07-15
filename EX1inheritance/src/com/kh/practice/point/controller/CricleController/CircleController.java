package com.kh.practice.point.controller.CricleController;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
    private Circle c = new Circle();
    public String calcArea(int x, int y,int radius){
        //c.setX(x);
       // c.setY(y);
        //c.setRadius(radius);
        c = new Circle(x,y,radius);
        double area = Math.PI * c.getRadius()*c.getRadius();
        return "면적 : " + c.toString()+" / "+ area;
    }
    public String calcCircum(int x,int y, int radius){
        //c.setX(x);
        //c.setY(y);
        //c.setRadius(radius);
        c= new Circle(x,y,radius);
        double circum = 2 * Math.PI * c.getRadius();
        return "원의 둘레 : " + c.toString()+ " / " +circum;
    }
}
