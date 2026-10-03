package STACK;

import java.util.Stack;

public class nextGreaterElementTwo {
    public int[] nextGreaterElements(int[] nums) {
       int n = nums.length;
       int[] nge = new int[n];
       Stack<Integer> st = new Stack<>();
       for(int i = n-1; i>=0; i--){
           st.push(nums[i]);
       }
       for(int i = n-1; i>=0; i--){
           while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
           }
           if(st.isEmpty()){
               nge[i] =-1;
           }
           else{
               nge[i] = st.peek();
           }
           st.push(nums[i]);
       }
       return nge;
    }
}
