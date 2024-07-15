package aaa;

public class Subject2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("카리나");
        students[1] = new Student("아이유");
        students[2] = new Student("이창섭");
        for (int i=0;i< students.length;i++){
            System.out.println(students[i]);
        }
    }
}

