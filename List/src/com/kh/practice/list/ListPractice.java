package com.kh.practice.list;

import com.kh.practice.list.MyStack;
import com.kh.practice.list.MyQueue;
import java.util.*;

public class ListPractice {
    /*
        List 특징
        : 중복이 가능하고, 순서가 있는 콜랙션

        * ArrayList
        - 배열구조
        - 데이터 조회가 빠름
        - 데이터 추가 / 삭제 복잡해 오래 걸림

        ArrayList<E> 참조변수명 = new ArrayList<[E]>(); [E] : E 타입 생략 가능!
        List<E> 참조변수명 = new ArrayList<[E]>();

        *LinkedList
        - 리스트 구조
        - 데이터 추가 / 삭제가 빠르다.
        - 데이터 조회가 느리다.

        LinkedList<E> 참조변수명 = new LinkedList<[E]>();
        List<E> 참조변수명 = new LinkedList<[E]>();

        List 관련 메소드
        - 저장된 데이터 크기 : size()
        - 데이터 추가 : add(데이터)
        - 데이터 삭제 : remove(인덱스)
        - 데이터 조회 : get(인덱스)
     */
    public static void main(String[] args) {
        //arrayListTest();
        //linkedListTest();
        //stackTest();
        queueTest();
    }

    public static void stackTest(){
        /*
            스택(Stack) : LIFO (Last In First Out)
                        제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올수 있는 구조
            - 데이터 추가 : 순서대로 추가 (끝에 추가)
            - 데이터 제거 : 마지막 위치부터 제거
         */
        /*  ------------------
            MyStack
            ------------------
            -arrStack : ArrayList<String> = new ArrayList<>();
            ------------------
            + push(data : String) : void     // 데이터 추가
            + pop() : String                 // 데이터 제거
                                             // isEmpty() => 데이터가 없을 경우 "리스트가 비었습니다." 반환
            ------------------               // remove() => arrStack(리스트)에서 데이터 제거 후 해당 데이터를 반환
         */
        MyStack stack = new MyStack();
        stack.push("레몬");
        stack.push("아보카도");
        stack.push("파인애플");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    public static void queueTest(){
        MyQueue myQueue = new MyQueue();

        myQueue.enQuene("엄마는 외계인");
        myQueue.enQuene("아몬드 봉봉");
        myQueue.enQuene("슈팅스타");
        myQueue.enQuene("죠스바");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
    public static void linkedListTest(){
        LinkedList<Integer> list = new LinkedList<>();
        // 사용자에게 정수 값을 입력 받아
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값을 입력하세요 : ");
        int length = sc.nextInt();
        for(int i =0; i<length;i++){
            int random=((int) (Math.random() * length + 1));
            list.add(random);
        }
        // 그 길이만큼 랜덤 값을 저장 (랜덤값 : 1~length)
        //저장된 출력 : printItem 메소드 사용
        printItem(list);
    }
    public static void arrayListTest(){
        // 문자열 데이터를 관리하는 ArrayList 객체 생성
        ArrayList<String> list = new ArrayList<>();

        //데이터 추가 : add
        list.add("찜닭");     // arr[0] = "찜닭";
        list.add("갈비찜");    // arr[1] = "갈비찜";
        list.add("닭갈비");    // arr[2] = "찜닭";

        // 데이터 조회 : get
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
        System.out.println("--------------------------------");
        for (String item: list){
            System.out.println(item);
        }
        System.out.println("-----------------------------");
        list.add(1, "돈가스"); // add(추가할 인덱스, 데이터)
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
        System.out.println("-----------------------------");
        // "돈가스 삭제" : remove
        list.remove(1);
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
        // 갈비찜을 돈가스로 변경 : set
        System.out.println("-----------------------------");
        list.set(2, "돈가스");
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
        Collections.swap(list,0,2);
        System.out.println("-----------------------------");
        list.set(2, "돈가스");

        printItem(list);
    }

    public static <E> void swapList(List<E>list, int n1, int n2){
         E s;
         //1) n1 위치의 있는 데이터를 변수에 저장
        s=list.get(n1);
        // 2) n2 위치 데이터를  n1위치에 저장
        list.set(n1, list.get(n2));
        // 3) n1을 다시 n2위치에 있는 곳에 저장
        list.set(n2, s);
    }
    public static <E> void printItem(List<E> list){
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
    }
}
