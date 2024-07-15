package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import com.kh.practice.set.model.vo.Lottery;
import com.kh.practice.set.model.compare.SortedLottery;

public class LotteryController {
    private HashSet <Lottery> lottery = new HashSet<>();
    private HashSet <Lottery> win = new HashSet<>();

    public boolean insertObject(Lottery l) {
        // 전달 받은 객체 (Lottery l)를 HashSet(lottery)에 추가 후 결과인 boolean 반환
        return lottery.add(l);      // 중복된 데이터인 경우 Set에 추가하지 않고 false 반환
    }
    public boolean deleteObject(Lottery l) {
        // 전달 받은 객체 (Lottery l)를 HashSet(lottery)에서 삭제

        // 당첨자 목록 (HshSet win) 중에도 삭제된 대상이 존재할 수 있으니
        // 삭제 결과 (lottery에서 삭제 후 결과)인 boolean 값과 win 객체가 null이 아닐때만
        boolean removed = lottery.remove(l);
        if (removed && win != null) {
            // win 객체에서도 해당 대상 삭제
            win.remove(l);
        }
        return removed;
    }
    public HashSet<Lottery> winObject() {
        //추첨 대상자 중에 랜덤으로 뽑아 당첨 목록에 넣는 메소드
        //랜덤으로 뽑기 위해 lottery(HashSet) 를 ArrayList에 담고
        //인덱스를 이용해 win에 당첨자 저장
        //당첨자 4명(단, 추첨자 수는 4명이상이어야 함)
        //당첨자 목록에 삭제된 추첨 대상자가 있다면 삭제된 사람의 자리만 새로운 추첨자로 채움
        if (lottery.size() <4){
            return null;
        }

        // HashSet ---> ArrayList
        ArrayList<Lottery> lotterylist = new ArrayList<>(lottery);
        //lotterylist.addAll(lottery);
        while (win.size() < 4) {
            // 랜덤값 --> 추첨자의 인덱스 (0~lottery.size()-1)
            // Math.random() * (최댓값 - 최소값 + 1) + 최소값
            int random = (int)(Math.random()*lottery.size());
            win.add(lotterylist.get(random));
        }
        return win;
    }
    public TreeSet<Lottery> sortedWinObject() {
        // * TreeSet 생성자에게 정렬 기준을 정의한 SortedLottery 객체의 인스턴스 전달
        TreeSet<Lottery> sortedSet = new TreeSet<>(new SortedLottery());
        sortedSet.addAll(win);
        return sortedSet;
    }
    public boolean searchWinner(Lottery l) {
        // 전달 받은 객체 (Lottery l)를 win 객체에서 찾고,
        // 찾은 결과인 boolean 값 반환
        return win.contains(l);
    }
}
