package com.kh.practice.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args) {
        //stackTest();
        //queueTest();
        //linkedListTest();
        arrayListTest();
    }
    public static void stackTest(){
        MyStack stack = new MyStack();
        stack.push("안녕");
        stack.push("하세요");
        stack.push("감사해요");
        stack.push("잘 있어요");
        stack.push("다시 만나요");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    public static void queueTest(){
        Myqueue queue = new Myqueue();
        queue.enQueue("안녕");
        queue.enQueue("하세요");
        queue.enQueue("감사해요");
        queue.enQueue("잘 있어요");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
    public static void linkedListTest(){
        LinkedList<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값을 입력하세요 : ");
        int length = sc.nextInt();
        for (int i =0;i<length;i++){
            int random = (int)(Math.random()*length+1);
            list.add(random);
        }
        printItem(list);
    }
    public static void arrayListTest(){
        ArrayList<String> list = new ArrayList<>();
        list.add("안녕");
        list.add("하세요");
        list.add("감사해요");
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
        System.out.println("--------------------------------");
        list.add(1, "돈가스"); // add(추가할 인덱스, 데이터)
        for(int i =0; i<list.size();i++){
            System.out.println(i + "번째 : "+list.get(i));
        }
        System.out.println("-----------------------------");
    }
    public static <E> void printItem(List<E> list){
        for (int i =0; i <list.size();i++){
            System.out.println(list.get(i));
        }

    }


}
