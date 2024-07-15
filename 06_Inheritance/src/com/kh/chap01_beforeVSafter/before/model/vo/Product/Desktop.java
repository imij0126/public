package com.kh.chap01_beforeVSafter.before.model.vo.Product;
//*.after.* 경로의 Desktop
public class Desktop extends Product {
    private boolean allInone;

    public Desktop(){}

    public Desktop(String brand,String code,String name,int price,boolean allInone){
        // 부모클래스의 매개변수가 4개인 생성자 호출
        super(brand,code,name,price);
        this.allInone = allInone;
    }
    public String information(){
        return super.information()+", allInOne = "+allInone;
    }
    //boolean 자료형 필드는 getter 이름이  isxxx로 지어진다.
    public boolean isAllInone(){
        return allInone;
    }
    public void setAllInone(boolean allInone){
        this.allInone = allInone;
    }
}
