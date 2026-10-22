class Solution {
    int count=0;
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0||j==0||i==grid.length-1||j==grid[0].length-1){
                    countEnclaves(grid,i,j);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public void countEnclaves(int[][]grid,int i,int j){
       if(i>=0&&i<=grid.length-1&&j>=0&&j<=grid[i].length-1&&grid[i][j]==1){
        grid[i][j]=0;
        countEnclaves(grid,i+1,j);
        countEnclaves(grid,i-1,j);
        countEnclaves(grid,i,j+1);
        countEnclaves(grid,i,j-1);
       }

    }
}
