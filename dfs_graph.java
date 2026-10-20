class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited=new boolean[adj.size()];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                dfs(adj,visited,i,res);
            }
        }
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int s,ArrayList<Integer> res){
        visited[s]=true;
        res.add(s);
        for(int i:adj.get(s)){
            if(!visited[i]){
                dfs(adj,visited,i,res);
            }
        }
    }
}
