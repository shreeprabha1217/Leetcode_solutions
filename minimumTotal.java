class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();

        int[][] dp = new int[m][m];
        boolean[][] visited = new boolean[m][m];

        return function(0, 0, triangle, dp, visited);
    }

    public int function(int row, int col,
                        List<List<Integer>> triangle,
                        int[][] dp, boolean[][] visited) {

        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        if (visited[row][col]) {
            return dp[row][col];
        }

        int down = function(row + 1, col, triangle, dp, visited);
        int diagonal = function(row + 1, col + 1, triangle, dp, visited);

        visited[row][col] = true;

        return dp[row][col] = triangle.get(row).get(col)
                              + Math.min(down, diagonal);
    }
}
