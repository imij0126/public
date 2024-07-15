package Eldenring;

interface king1 <ladan>{
    void method1(ladan data);
}
interface king2 <malenia>{
    void method2(malenia data);
}
interface king3 <rani>{
    void method3(rani data);
}

class eldergod<E> implements king1<E>,king2<E>,king3<E>{
    public void method1(E data){
        System.out.println(data);
    }
    public void method2(E data){
        System.out.println(data);
    }
    public void method3(E data){
        System.out.println(data);
    }
}

public class Eldenring {
    public static void main(String[] args) {
        eldergod<String> e1 = new eldergod<>();
        e1.method1("별 부수는 자");
        e1.method2("미켈라의 칼날");
        e1.method3("어두운 밤");

        eldergod<Integer> e2 = new eldergod<>();
        e2.method1(1000);
        e2.method2(2000);
        e2.method3(3000);

        eldergod<String> e3 = new eldergod<>();
        e3.method1("파괴왕");
        e3.method2("검객");
        e3.method3("달의 여왕");
    }
}
