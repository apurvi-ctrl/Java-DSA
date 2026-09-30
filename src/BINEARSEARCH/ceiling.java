package BINEARSEARCH;

public class ceiling {
    public static void main(String[] args){
        int[] arr = {23,33,43,53,63};
        int target = 55;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    //ceiling = element >=target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

}
