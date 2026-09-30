package SORTING;
import java.util.*;

public class bubble {
    public static void main(String[] args){
     int[] arr={4,2,9,6,7};
     bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
       static void bubble(int[] arr) {
        boolean swapped;
          //run for n-1 steps
           for (int i = 0; i < arr.length; i++) {
               swapped = false;
               //for each step , maximum item will come last
               for(int j = i +1; j <arr.length; j++){
                   if(arr[j-1]>arr[j]){
                       //swap
                       int temp = arr[j-1];
                       arr[j-1] = arr[j];
                       arr[j] = temp;
                       swapped = true;
                   }
               }
               //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
               if(!swapped){
                   break;
               }

           }
       }
}
