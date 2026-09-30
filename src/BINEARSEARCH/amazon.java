package BINEARSEARCH;
// find position of an element in a sorted array of infinite numbers

public class amazon {
     public static void main(String[] args) {
      int[] arr = {3,5,7,9,10,99,100,130,140,160,170};
      int target = 10;
         System.out.println(ans(arr,target));
     }
     static int ans(int[] arr, int target){
         // find first range
         //first start with size 2
         int start = 0;
         int end = 1;
         //condition for the target to lie in the range
         while(target>arr[end]){
             int newstart = end +1;
             //double the box value
             end = end +(end - start +1)*2;
             start = newstart;
         }
         return binarysearch(arr,target,start, end);
     }
     static int binarysearch(int[] arr,int target,int start, int end){
         while(start<=end){
             int mid = start +(end -start)/2;
             if(arr[mid]<target){
                 start = mid+1;
             }
             else if(arr[mid]>target){
                 end = mid-1;
             }
             else{
                 return mid;
             }
         }
         return -1;
     }
}
