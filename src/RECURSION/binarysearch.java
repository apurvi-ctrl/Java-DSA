package RECURSION;

public class binarysearch {
    public static void main(String[] args) {
     int[] arr ={1,23,34,39,56,78,89,90};
        System.out.println(search(arr,23,0,arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
       int m = s +(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1,e);
    }

}
