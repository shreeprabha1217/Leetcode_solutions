class Solution {
    public int countSCC(ArrayList<ArrayList<Integer>> adj) {
        // code here
       List<List<Integer>> transpose=new ArrayList<>();
       for(int i=0;i<adj.size();i++){
           transpose.add(new ArrayList<>());
       }
       for(int i = 0; i < adj.size(); i++){
           for(int neighbor : adj.get(i)){
               transpose.get(neighbor).add(i);
           }
       }
       boolean[] visited=new boolean[adj.size()];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<adj.size();i++){
           if(!visited[i]){
               dfs1(i,adj,visited,st);
           }
       }
       Arrays.fill(visited, false);

       int count = 0;
       while(!st.isEmpty()){
           int node=st.pop();
           if (!visited[node]) {
                          count++;

                          dfs2(node, transpose, visited);
                      }
       }
       return count;
            
    }
     public void dfs1(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,Stack<Integer> st){
                visited[node]=true;
                for(int neighbor:adj.get(node)){
                    if(!visited[neighbor]){
                        dfs1(neighbor,adj,visited,st);
                    }
                }
                st.push(node);
            }

            public void dfs2(int node,List<List<Integer>> transpose,boolean[] visited){
                visited[node]=true;
                for(int neighbor:transpose.get(node)){
                    if(!visited[neighbor]){
                        dfs2(neighbor,transpose,visited);
                    }
                }
            }
}
