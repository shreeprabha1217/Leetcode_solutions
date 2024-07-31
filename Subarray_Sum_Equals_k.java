class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int preSum=0,count=0;
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int remove=preSum-k;
            count+=m.getOrDefault(remove,0);
            m.put(preSum,m.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}
