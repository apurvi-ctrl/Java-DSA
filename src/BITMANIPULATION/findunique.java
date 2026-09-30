package BITMANIPULATION;
import java.util.*;
public class findunique {
   public static void main(String[] args) {
       int[] arr= {2,3,4,1,2,3,4,6,1};
       System.out.println(unique(arr));
    }
    static int unique(int[] arr){
       int ans = 0;
       for(int n:arr) {
           ans ^= n;
       }
       return ans;
       }
    }

