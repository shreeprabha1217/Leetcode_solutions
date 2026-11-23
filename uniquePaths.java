class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
         for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return function(m-1,n-1,dp);
    }

    public int function(int row,int col,int[][]dp){
        if(row<0||col<0){
            return 0;
        }
        if(row==0&&col==0){
            return 1;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
      
        int up=function(row-1,col,dp);
        int left=function(row,col-1,dp);
        return dp[row][col] = up + left;
    }
}
