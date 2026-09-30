package SORTING;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr={4,5,2,3,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int[] arr){
        int i =0;
        while(i<arr.length){
            int  correct = arr[i] -1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct]= temp;
            }
            else{
                i++;

            }
        }
    }
}
