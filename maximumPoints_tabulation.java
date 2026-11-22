
class Solution {
    public int maximumPoints(int mat[][]) {
        int n = mat.length;

        int[][] dp = new int[n][4];
        dp[0][0]=Math.max(mat[0][1],mat[0][2]);
        dp[0][1]=Math.max(mat[0][0],mat[0][2]);
        dp[0][2]=Math.max(mat[0][1],mat[0][0]);
        dp[0][3]=Math.max(mat[0][1],Math.max(mat[0][2],mat[0][1]));
        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;
                int maxi=0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int point = mat[day][task]
                            + dp[day-1][task];

                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                 }
                
            }
        }
        return dp[n-1][3];
    }
}
