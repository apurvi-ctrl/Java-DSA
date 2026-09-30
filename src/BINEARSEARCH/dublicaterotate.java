package BINEARSEARCH;

public class dublicaterotate {
    public static void main(String[] args) {
        int[] arr ={2,2,2,7,2,2,2};
        System.out.println(findpivotwithdublicate(arr));
        System.out.println(search(arr,2));
    }
    static int search(int[] arr, int target) {
        int pivot = findpivotwithdublicate(arr);
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
    static int findpivotwithdublicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        //4 cases
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        // if elements at middle,start,end are equal then just skip the dublicates
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            //if start and ends are pivot?
            //so first check start and end
            if (arr[start] > arr[start + 1]) {
                return start;
            }
            start++;
            if (arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        } else if (arr[mid] > arr[start] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        return -1;
    }
}

