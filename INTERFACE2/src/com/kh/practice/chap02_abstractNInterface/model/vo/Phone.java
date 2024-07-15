package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
    public static final char[] NUMBERPAD = {'1','2','3',
                                            '4','5','6',
                                            '7','8','9',
                                            '*','0','#'};
    // 추상 메소드 2개
    public abstract String makeCall();
    public abstract String takeCall();//여기서 public abstract는 생략해도 상관없다.

}
