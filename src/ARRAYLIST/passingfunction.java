package ARRAYLIST;
import java.util.*;

public class passingfunction {
    public static void main(String[] args){
        int[] nums = {12,23,45,67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int[] arr){
        arr[1] = 91;
    }
}
