package GRAPH;
import java.util.*;
public class canVisitAllRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        bfs(rooms,visited,0);
        for(boolean e : visited){
            if(e==false){
                return false;
            }
        }
        return true;
    }
    void bfs(List<List<Integer>> rooms, boolean[] visited,int i){
    Queue<Integer> q = new LinkedList<>();
    q.add(i);
    while(!q.isEmpty()){
        int front = q.remove();
        for(int j : rooms.get(front)){
            if(!visited[j]){
                visited[j] = true;
                q.add(j);
            }
        }
    }
    }
}
