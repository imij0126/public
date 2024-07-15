package com.kh.practice.point.controller.RectangleController;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
    private Rectangle r = new Rectangle();
    public String calcArea(int x, int y, int height, int width){
        r = new Rectangle(x,y,width,height);
        return "사각형 넓이 : "+ r.toString() + " / "+(r.getWidth()*r.getHeight());
    }
    public String calcPerimeter(int x, int y, int height,int width){
        r = new Rectangle(x,y,width,height);
        return "사각형 둘레 : " + r.toString() + " / " + (r.getHeight()*2)+(r.getWidth()*2);
    }
}
