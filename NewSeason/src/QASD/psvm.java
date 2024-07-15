package QASD;

public class psvm {
    public static void main(String[] args) {
        int [][]arr= new int[4][4];
        for(int i =0;i<arr.length;i++) {
            for(int j =0;j<arr[i].length;j++) {
                arr[i][j] = (int)(Math.random()*10+1);
                if(i == 3 && j!=3) {
                    arr[3][j] = arr[2][j]+arr[1][j]+arr[0][j];
                }else if(i != 3 && j == 3) {
                    arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
                }else if(i == 3 && j == 3) {
                    arr[3][3] = arr[2][j]+arr[1][j]+arr[0][j]+arr[i][0]+arr[i][1]+arr[i][2];
                }
            }
        }
        for(int i=0; i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
