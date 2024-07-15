package moc.kh.practice;

public class ThreadRun {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t2.start();
        t1.start();
    }

}
