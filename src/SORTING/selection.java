package SORTING;

import java.util.Arrays;

public class selection {
    public static void main(String[] args){
        int[] arr ={23,56,34,89,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max element and swap it with correct position
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr , int first ,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
   private static int getMaxIndex(int[] arr, int start, int end) {
     int max=  start;
     for(int i=start; i<=end; i++){
         if(arr[i]>arr[max]){
             max = i;
    }
     }
     return max;


    }
}
