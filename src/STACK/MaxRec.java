package STACK;

import java.util.Stack;

public class MaxRec {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i = n-2; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        int max =0;
        for(int i = 0; i < n; i++) {
            int area = heights[i]*(nse[i] - pse[i] -1);
            max = Math.max(max, area);
        }
        return max;
    }
    static int maxArea(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j]==1) mat[i][j]+=mat[i-1][j];
            }
        }
        int max = 0;
        for(int[] row:mat){
            int area = largestRectangleArea(row);
            max=Math.max(max,area);
        }
        return max;
    }
}
