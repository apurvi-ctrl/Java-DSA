package BINEARSEARCH;

public class rotationcount {
    public static void main(String[] args) {
        int[] arr ={2,2,2,7,2,2,2};

    }
    //not correct code
    static int countRotations(int[] arr) {
     findpivotwithdublicate(arr);
     return 0;
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
