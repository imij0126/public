package com.kh.practice;

import java.io.*;

// 직렬화 적용 : Serializable 인터페이스 구현
class Student implements Serializable {
    String name;
    int age;
    double height;

    public Student(String name, int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public String toString(){
        return "Student [name="+name+", age="+age+", height="+height+"]";
    }
}

public class IO06_ObjectOutputStream {
    public static void main(String[] args) {
        File f = new File(".//resource","ObjectTest.txt");

        // 스트림 : ObjectOutputStream
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(f))
            );
            // 출력 대상 객체(데이터)
            Student s1 = new Student("양준혁",25,174);
            Student s2 = new Student("이주원",23,170);
            Student s3 = new Student("최종군",31,180.1);

            //출력!
            oos.writeObject(s1);
            oos.flush();
            oos.writeObject(s2);
            oos.writeObject(s3);
            oos.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
