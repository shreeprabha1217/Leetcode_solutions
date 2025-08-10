public class TwoSingleNumbers {
    public static int[] findTwoSingles(int[] nums) {
        // Step 1: XOR of all numbers = XOR of the two singles
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }

        // Step 2: Find a set bit (differs between the two singles)
        int diffBit = xorAll & (-xorAll); // isolates rightmost set bit

        // Step 3: Divide numbers into two groups and XOR separately
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                num1 ^= num; // group without the set bit
            } else {
                num2 ^= num; // group with the set bit
            }
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 5};
        int[] result = findTwoSingles(nums);
        System.out.println("The two single numbers are: " + result[0] + " and " + result[1]);
    }
}
