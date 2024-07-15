package com.kh.practice.chap02_abstractNInterface.model.vo;

//Phone, Camera 인터페이스 상속 : extends
public interface CellPhone extends Phone, Camera {
    // 상수 : 1개(Phone.Numberpad)
    //추상메소드 : 4개 (phone - 2(makecall/takecall) ,camera - 1 (picture)
    //                  , CellPhone - 1 (Charge))
    public abstract String charge();
}
