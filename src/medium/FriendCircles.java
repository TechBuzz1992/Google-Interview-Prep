package medium;

public class FriendCircles {
    public static void main(String[] args) {
        int[][] M = {

                { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };

        System.out.println(new FriendCircles().circles(M));

    }

    public int circles(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M[i].length; j++) {
            if (visited[j] == 0 && M[i][j] == 1) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }

}