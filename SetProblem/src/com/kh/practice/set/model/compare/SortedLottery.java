package com.kh.practice.set.model.compare;

import java.util.Comparator;
import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {
    @Override
    public int compare(Lottery o1, Lottery o2) {
        // 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는 정렬
        // 정렬된 결과를 반환
        int nameCompare = o1.getName().compareTo(o2.getName());
        /*
            compareTo : 오름차순
            - 0 : A 와 B가 같을 때
            - 양수 (0<) : A 가 B보다 클 때 . A B
            - 음수 (0>) : A 가 B보다 작을 때 . B A
         */
        if (nameCompare == 0) {
            // 이름이 같을 경우 번호로 정렬 기준 확인
            return o1.getPhone().compareTo(o2.getPhone());
        }
        return nameCompare;
    }
}
