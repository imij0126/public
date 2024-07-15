package Array;

public class Practice3 {
    public static void main(String[] args) {
        int [][]arr = new int[4][4];
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = 17-((j*4)+i+1);
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                    System.out.printf("%3d",arr[i][j]);
                }
            }System.out.println();
        }
    }

