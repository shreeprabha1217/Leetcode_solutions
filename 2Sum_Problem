class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h=new HashMap<>();
        int dup[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (h.containsKey(complement)) {
                
                dup[0] = h.get(complement);
                dup[1] = i;
                return dup;
            }

            h.put(nums[i], i);
        }

        
        return new int[]{-1, -1};
        }
    }
