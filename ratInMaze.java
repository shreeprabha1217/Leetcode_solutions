class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        ArrayList<String> list=new ArrayList<>();
        boolean[][] visited=new boolean[n][n];
        if(maze[0][0]==0){
            return list;
        }
        solve(0,0,maze,visited,"",list);
        Collections.sort(list);
        return list;
    }
    
    public void solve(int row,int col,int[][] maze,boolean[][] visited,String direction,
    ArrayList<String> list){
         int n=maze.length;
         if (row < 0 || col < 0 || row >= n || col >= n ||
                 maze[row][col] == 0 || visited[row][col]) {
                 return;
             }
              if(row==n-1&&col==n-1){
             list.add(direction);
             return;
         }
         if(maze[row][col]==1){
             visited[row][col]=true;
         }
         solve(row + 1, col, maze, visited, direction + "D", list);
         solve(row, col - 1, maze, visited, direction + "L", list);
         solve(row, col + 1, maze, visited, direction + "R", list);
         solve(row - 1, col, maze, visited, direction + "U", list);
         visited[row][col] = false;
    }
}
