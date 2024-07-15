package com.kh.practice.map.controller;

import com.kh.practice.map.model.vo.Member;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
    private HashMap<String,Member> map = new HashMap<>();
    public boolean joinMembership(String id, Member m){
        // 전달받은 id가 없으면 id와 m을 map에 추가 후 true 반환
        if(!map.containsKey(id)){
            map.put(id,m);
            return true;
        }
        return false;
    }
    public String login(String id, String password){
        System.out.println(id + ", " + password);
        Member m = (Member) map.get(id); // Map 에서 id(key)에 해당하는 데이터를 조회
        if (m != null){
            if (m.getPassword().equals(password)){  // 저장된 비밀번호와 전달된 비밀번호를 비교
                return m.getName();             // 같다면, 해당 객체의 이름 데이터를 반환
            }
        }
        return null;    // 그 외 모든 경우는 null 반환
    }
    public boolean changePassword(String id,String oldPw,String newPw){
        Member m = map.get(id);     // id에 해당하는 객체를 Map에 조회
        if (m != null){             // 데이터가 있다면
            if (m.getPassword().equals(oldPw)){ // 저장된 비밀번호와 입력된 기존 비밀번호가 같다면
                // 새로운 비밀번호로 변경
                m.setPassword(newPw);   // map 저장된 객체의 주소를 m참조변수가 가리키고 있으므로 setter로 처리 가능!
                return true;
            }
        }
        return false;
    }
    public void changeName(String id, String newName){
        if (map.containsKey(id)){      // Map에 해당 id 의 데이터가 존재한다면(포함되어있다면?)
            Member m = map.get(id);    // 데이터를 조회해와서 객체의 name 필드 값을 변경
            m.setName(newName);
        }
    }
    public TreeMap sameName(String name){
        TreeMap tMap = new TreeMap (new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                return s1.compareTo(s2);
            }
        });
        // (HashMap)map 의 키 목록 조회 : keyset()
        for (String K : map.keySet()){
            Member m = map.get(K);
            if (m.getName().equals(name)){
                tMap.put(K,m.getName()); // K : 아이디
            }
        }
        return tMap;
    }
}
