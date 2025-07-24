class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {
            int count = 0;
            while (a >= (b << (count + 1))) {
                count++;
            }
            result += 1 << count;
            a -= b << count;
        }

        boolean sameSign = (dividend > 0) == (divisor > 0);

        return sameSign ? result : -result;
    }
}
