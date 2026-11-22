
class Solution {
    public int maximumPoints(int mat[][]) {
        int n = mat.length;

        int[][] dp = new int[n][4];

        // Initialize with -1 (not calculated)
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return function(n - 1, 3, mat, dp);
    }

    public int function(int day, int last, int mat[][], int[][] dp) {

        // Check if already calculated
        if (dp[day][last] != -1) {
            return dp[day][last];
        }

        if (day == 0) {
            int maxi = 0;

            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, mat[0][task]);
                }
            }

            return dp[day][last] = maxi;
        }

        int maxi = 0;

        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = mat[day][task]
                    + function(day - 1, task, mat, dp);

                maxi = Math.max(maxi, point);
            }
        }

        return dp[day][last] = maxi;
    }
}
