package BINEARSEARCH;

public class rotate {
    public static void main(String[] args) {
     int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
        System.out.println(search(arr,4));
    }
    static int search(int[] arr, int target) {
       int pivot = findpivot(arr);
       // if u did not find pivot , it means the array is not rotated
        if(pivot == -1){
            //just do binary search
            return binarysearch(arr,target,0,arr.length-1);
        }
        //if you find pivot  , u have found 2 asc sorted arrays
        //3 cases
        else if(arr[pivot] == target){
            return pivot;
        }
        else if(arr[0] <=target){
            return binarysearch(arr,target,0,pivot -1);
        }
        else{
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }

    }
    static int binarysearch(int[] arr, int target,int start,int end) {
        while(start<=end){
            int mid =start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        //4 cases
        if( mid<end&&arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid>start&&arr[mid]< arr[mid-1]) {
            return mid - 1;
        }
        // this will not run for dublicate elements
        if(arr[mid] <=arr[start]){
            end = mid-1;
        }else{
            start = mid+1;
        }
        return -1;
    }
}
