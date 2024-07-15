package moc.kh.practice;

public class Task2 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
