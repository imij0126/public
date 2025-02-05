package Exception;
public class ExceptionTest1 {
	public static void main(String[] args) {
        exceptionTest2();
    }
    /*
    NegativeArraySizeException, ArrayIndexOutOfBoundsException
    -5~5사이 난수를 발생시켜 하당 난수 크기로 배열 생성한 후
    1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력
    (프로그램이 정상적으로 종료되는것을 확인하기 위해 처음과 끝에 "start","end"출력)
     */
    public static void exceptionTest2(){
        System.out.println("start");
        try {
            int num = (int)(Math.random()*11-5);
            int arr[] = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = i + 1;
            }
            for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }

        }
        catch (NegativeArraySizeException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
