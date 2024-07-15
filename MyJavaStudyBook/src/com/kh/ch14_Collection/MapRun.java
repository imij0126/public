package com.kh.ch14_Collection;

import java.util.HashMap;
import java.util.Set;

public class MapRun {
    /*
        Map<K,V> : key - value 형식으로 데이터를 관리하는 컬랙션
        => List,set 과 달리 컬랙션을 구현한 클래스는 아님!
            (메소드가 일부 다름)
     */
    public static void main(String[] args) {
        HashMap<String,Snack> hMap = new HashMap<>();

        //데이터 추가 : put(key, value)
        hMap.put("바나나킥",new Snack("바나나맛",1024));
        hMap.put("도리토스",new Snack("바베큐",2048));
        hMap.put("프링글스",new Snack("어니언앤사워",4096));
        hMap.put("도리토스2",new Snack("크림맛",1234));
        // = > 키 값이 같은 경우 데이터(value) 가 덮어씌워짐!
        System.out.println(hMap);
        // => 저장되는 순서가 유지되지 않음
        // => 키 값이 다르고 데이터값이 동일해도 추가가 됨!
        // 데이터 조회  : get(Object key) --> 키값에 해당하는 데이터를 조회
        System.out.println(hMap.get("바나나킥"));
        // replace(k key, V newValue) 키 값에 해당하는 데이터를 찾아서 다시 전달한 데이터로 변경해주는 메소드
        hMap.replace("도리토스2",new Snack("바베큐맛",512));
        //  키 목록 조회 : keySet() : Set<k>
        Set<String> keyList = hMap.keySet();
        System.out.println(keyList);
        for (String key : keyList){
            System.out.println(hMap.get(key));
        }
    }
}
class Snack{
    private String flavor;
    private int calory;
    public Snack(String flavor,int calory){
        this.flavor=flavor;
        this.calory=calory;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "flavor='" + flavor + '\'' +
                ", calory=" + calory +
                '}';
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public int getCalory() {
        return calory;
    }
    public void setCalory(int calory) {
        this.calory = calory;
    }
}
