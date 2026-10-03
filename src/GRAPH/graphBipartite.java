package GRAPH;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class graphBipartite {
    static boolean ans;
    public boolean isBipartite(int[][] graph) {
        ans = true;
      int n = graph.length;
      int[] visited = new int[n];
      Arrays.fill(visited, -1);
      for(int i = 0; i < n; i++){
         if(visited[i] == -1) {
             visited[i] = 0; // 1 means read & 0 means blue
             if(!bfs(i, graph, visited)){
               return false;
             }
         }
      }
        return ans;
    }
    public boolean bfs(int i, int[][] graph, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            int color = visited[front];
            for(int e : graph[front]){
                    if(visited[e] == color){
                        ans = false;
                        return ans;
                    }
                if(visited[e]==-1){
                    visited[e]=1-color;
                    q.add(e);

                }
            }
        }
        return true;
    }
}

