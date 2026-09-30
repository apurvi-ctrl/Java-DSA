package ARRAYLIST;
import java.util.*;

public class program  {
    public static void main (String[] args){
        Scanner pr = new Scanner (System.in);
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 20;
        arr[2] = 25;
        arr[3] = 27;
        arr[4] = 30;
        System.out.println(Arrays.toString(arr));
        //array of primitive
        for(int i = 0; i <arr.length; i++){
            arr[i] = pr.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + " ");
        }

        // array of objects
        String [] str = new String[5];
        for(int i = 0; i<str.length; i++){
            str[i] = pr.next();
        }
        for(String s : str){
            System.out.println(s + " ");
        }
        System.out.println(Arrays.toString(str));
        str[2]="apurvi";
        str[1]="chipu";
        System.out.println(Arrays.toString(str));
    }
}
