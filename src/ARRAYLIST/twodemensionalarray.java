package ARRAYLIST;
import java.util.*;

public class twodemensionalarray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][];

      arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[6];
       //input
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
