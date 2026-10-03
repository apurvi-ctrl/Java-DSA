package GRAPH;

public class dfsprovinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, isConnected);
                count++;
            }
        }
        return count;
    }
    void dfs(int i, boolean[] visited, int[][] isConnected) {
        int n = isConnected.length;
        visited[i] = true;
        for (int j = 0; j < n; j++) {
            if (!visited[j] && isConnected[i][j] == 1) {
                dfs(j, visited, isConnected);
            }
        }
    }
}
