package com.kh.practice.map.controller;

import com.kh.practice.map.model.vo.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberController {
    private HashMap <String, Member> map = new HashMap<>();
    public boolean joinMembership(String id,Member m){
        if (!map.containsKey(id)){
            map.put(id,m);
            return true;
        }
        return false;
    }
    public String login(String id,String password){
        if (map.containsKey(id)){
            Member m = map.get(id);
            if (m.getPassword().equals(password)){
                return m.getName();
            }
        }
        return null;
    }
    public boolean changetPassword(String id,String oldPw){

    }
    public void changeName(String id, String newName){

    }
    public TreeMap<String, Member> sameName(String name){
        Iterator<Member> is = I
    }
}
