package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class island {
    public int numIslands(char[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int count = 0;
      boolean[][] visited = new boolean[m][n];
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(grid[i][j] == '1' && !visited[i][j]){
                bfs(i,j,grid,visited);
                count++;
            }
        }
      }
      return count;
    }

    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public void bfs(int i, int j, char[][] grid, boolean[][] visited){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(i,j));
        while(!queue.isEmpty()){
            Pair front = queue.remove();
            int row = front.row ,col = front.col;
            if(row>0){    // top
                if(grid[row-1][col] == '1' && !visited[row-1][col]){
                    queue.add(new Pair(row-1,col));
                    visited[row-1][col] = true;
                }
            }
            if((row+1)<m){    // bottom
                if(grid[row+1][col] == '1' && !visited[row+1][col]){
                    queue.add(new Pair(row+1,col));
                    visited[row+1][col] = true;
                }
            }
            if((col)>0){    // left
                if(grid[row][col-1] == '1' && !visited[row][col-1]){
                    queue.add(new Pair(row,col-1));
                    visited[row][col-1] = true;
                }
            }
            if((col+1)<n){    // right
                if(grid[row][col+1] == '1' && !visited[row][col+1]){
                    queue.add(new Pair(row,col+1));
                    visited[row][col+1] = true;
                }
            }
        }
    }
}
