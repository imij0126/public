package com.kh.ch14_Collection;

import java.util.ArrayList;

public class ArrayListRun {
    /*
        * 컬랙션 : 자료구조 개념이 내장되어 있는 클래스
        *         자바에서 기본적으로 제공되는 "자료구조" 담당 "프레임워크"
        *
     */
    public static void main(String[] args){
        /*
            List<E> ": 순서가 있고, 중복이 허용
         */
        ArrayList list = new ArrayList(); // E --> Object 제네릭이 오브젝트 타입으로 변경
        System.out.println(list);   // 비어있는 상태
        //ArrayList list2 = new ArrayList<>(5);   // 5 크기를 지정
        //System.out.println(list2);
        // 데이터 추가 : add(E e)
        ArrayList<Music> mList = new ArrayList<>();
        mList.add(new Music("하입보이","뉴진스"));
        mList.add(new Music("Believer","Imagine Dragons"));
        //mList.add("끝"); => 타입을 Music으로 지정했기 때문에, 문자열 데이터는 추가 불가!
        for (Music m : mList){
            System.out.println(m);
        }
        for (int i =0;i<mList.size();i++){
            System.out.println(mList.get(i));
        }
        // 모두 지우고자 할 때 : clear()
        mList.clear();
        //리스트가 비어있는지 확인하는 메소드 : isEmpty()
        System.out.println(mList.isEmpty());
        // => 크기 제약이 없음 : 지정된 크기보다 더 많은 데이터를 추가해도 가능! (오류x)
    }
}

class Music {
    private String title;
    private String artist;
    public Music(String title,String artist){
        this.title=title;
        this.artist=artist;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music{ title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}