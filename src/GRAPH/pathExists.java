package GRAPH;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pathExists {
    public boolean validPath(int n, int[][] edges, int source, int destination){
        if(source==destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> temp = new ArrayList<>();
            adj.add(temp);
        }
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] visited =  new boolean[n];
        visited[source] = true;
        bfs(source,adj,visited);
        return visited[destination];
    }
    void bfs(int source, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while(!queue.isEmpty()){
            int front = queue.remove();
            for(int ele : adj.get(front)){
                if(!visited[ele]){
                    queue.add(ele);
                    visited[ele] = true;
                }
            }
        }
    }
}
