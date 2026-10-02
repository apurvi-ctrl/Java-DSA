package GRAPH;
import java.util.*;
public class floodfill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        if (image[sr][sc] == color) {
            return image;
        }
        boolean[][] visited = new boolean[m][n];
        bfs(image, sr, sc, color, visited);
        return image;
    }

    void bfs(int[][] image, int sr, int sc, int color, boolean[][] visited) {
        int m = image.length;
        int n = image[0].length;
        int old = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { sr, sc });
        visited[sr][sc] = true;
        while (!q.isEmpty()) {
            int[] front = q.remove();
            int row = front[0];
            int col = front[1];
            image[row][col] = color;
            if (row > 0) { // top
                if (image[row - 1][col] == old && !visited[row - 1][col]) {
                    q.add(new int[] { row - 1, col });
                    visited[row - 1][col] = true;
                }
            }
            if ((row + 1) < m) { // bottom
                if (image[row + 1][col] == old && !visited[row + 1][col]) {
                    q.add(new int[] { row + 1, col });
                    visited[row + 1][col] = true;
                }
            }
            if ((col + 1) < n) { // right
                if (image[row][col + 1] == old && !visited[row][col + 1]) {
                    q.add(new int[] { row, col + 1 });
                    visited[row][col + 1] = true;
                }
            }
            if (col > 0) { // left
                if (image[row][col - 1] == old && !visited[row][col - 1]) {
                    q.add(new int[] { row, col - 1 });
                    visited[row][col - 1] = true;
                }
            }
        }
    }
}

