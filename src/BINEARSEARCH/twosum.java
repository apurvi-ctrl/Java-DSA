package BINEARSEARCH;

public class twosum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(twoSum(numbers,9));
    }

    static int[] twoSum(int[] numbers,int target){
       int s = 0;
       int e = numbers.length-1;
       while(s < e){
           int sum = numbers[s]+numbers[e];
           if(sum==target){
               return new int[]{s+1,e+1};
           }
          else if(sum>target){
               e--;
           }else{
               s++;
           }

       }
        return new int[] {};
    }
}
