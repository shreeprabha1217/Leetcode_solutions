class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] isVisted=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!isVisted[i]){
                dfs(isConnected,i,isVisted);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] isConnected, int node, boolean[] isVisited){
        isVisited[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(!isVisited[i]&&isConnected[node][i]==1){
                dfs(isConnected,i,isVisited);
            }
        }
    }
}
