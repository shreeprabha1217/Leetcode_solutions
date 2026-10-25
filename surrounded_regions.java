class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
    
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }
 
  
        for (int j = 0; j < n; j++) {
            dfs(board, 0, j);
            dfs(board, m - 1, j);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (board[i][j] == 'O') {
    board[i][j] = 'X';
} else if (board[i][j] == '#') {
    board[i][j] = 'O';
}
            }
        }
    }
    public void dfs(char[][] board,int sr,int sc){
        int m=board.length;
        int n=board[0].length;
        if(sr<0||sr>m-1||sc<0||sc>n-1){
            return;
        }
        if(board[sr][sc]=='O'){
            board[sr][sc]='#';
        }else{
            return;
        }
        dfs(board,sr+1,sc);
        dfs(board,sr-1,sc);
        dfs(board,sr,sc+1);
        dfs(board,sr,sc-1);
    }
}
