class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
           adj.get(v).add(u);
        }
        int[] state = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (dfs(i, adj, state)) {
                    return false; // Cycle exists; cannot finish
                }
            }
        }
        return true;
    }

    public boolean dfs(int node,List<List<Integer>> adj,int[] state){
        state[node] = 1;

        for (int neighbor : adj.get(node)) {
            if (state[neighbor] == 1) {
                return true; 
            }

            if (state[neighbor] == 0) {
                if (dfs(neighbor, adj, state)) {
                    return true;
                }
            }
        }

        state[node] = 2;
        return false;
    }
}
