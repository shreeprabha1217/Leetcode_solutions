class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int[][] dist=new int[m][n];
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        minHeap.add(new int[]{0,0,0});
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        while(!minHeap.isEmpty()){
            int[] top=minHeap.poll();
            int effort=top[0],x=top[1],y=top[2];
            if(effort>dist[x][y]){
                continue;
            }
            if(x==m-1&&y==n-1)
                return effort;
            for(int[] dir:directions){
                int nx=x+dir[0];
                int ny=y+dir[1];
                if(nx>=0&&nx<m&&ny>=0&&ny<n){
                    int new_effort=Math.max(effort,Math.abs(heights[x][y]-heights[nx][ny]));
                    if(new_effort<dist[nx][ny]){
                        dist[nx][ny]=new_effort;
                        minHeap.add(new int[]{new_effort,nx,ny});
                    }
                }
            }
        }
        return -1;
    }
}
