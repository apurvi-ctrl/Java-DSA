package RECURSION;

public class sorted {
    public static void main(String[] args){
     int[] arr={3,4,5,6,7,8,9};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int arr[], int index){
        //base condition
        if(index == arr.length -1){
            return true;
        }
        return arr[index]<arr[index+1]&&sorted(arr,index+1);
    }

}
