
class Solution {
    public boolean canCross(int[] stones) {

        int n = stones.length;

        if (n == 1) return true;
        if (stones[1] != 1) return false;

        boolean[][] dp = new boolean[n][n + 1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        dp[0][0] = true;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k <= n; k++) {

                if (!dp[i][k]) {
                    continue;
                }

                for (int jump = k - 1; jump <= k + 1; jump++) {

                    if (jump <= 0) continue;

                    int nextPosition = stones[i] + jump;

                    if (map.containsKey(nextPosition)) {
                        int nextIndex = map.get(nextPosition);
                        dp[nextIndex][jump] = true;
                    }
                }
            }
        }

        for (int k = 0; k <= n; k++) {
            if (dp[n - 1][k]) {
                return true;
            }
        }

        return false;
    }
}
