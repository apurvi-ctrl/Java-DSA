package RECURSION;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        System.out.println(search(arr,18,0));
        System.out.println(searchindex(arr,18,0));
    }
    static boolean search(int[] arr, int target , int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||search(arr,target,index+1);

    }
    static int searchindex(int[] arr, int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return searchindex(arr, target, index + 1);
        }
    }
}
