package RECURSION;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
    int[] arr ={1,2,3,4,4,8};
       // System.out.println(rlist(arr,4,0,new ArrayList<>()));
        System.out.println(rlist1(arr,4,0));
    }
    static ArrayList<Integer> rlist(int[] arr, int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
       return rlist(arr, target, index+1, list);
    }
    static ArrayList<Integer> rlist1(int[] arr, int target , int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function only
        if(arr[index] == target){
            list.add(index);
        }
       ArrayList<Integer> ansfrombelowCalls = rlist1(arr,target,index+1);
        list.addAll(ansfrombelowCalls);
        return list;
    }
}
