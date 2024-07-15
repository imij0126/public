package Array;

public class Practice2 {
    public static void main(String[] args) {
        int [][]arr = new int[4][4];
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                arr[i][j] += 1+(i*4)+j;
            }
        }
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++) {
                System.out.printf("%3d",arr[i][j]);

            }
            System.out.println();
        }
    }
}
