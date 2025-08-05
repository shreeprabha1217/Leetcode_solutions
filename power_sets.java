class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<(1<<len);i++){
            List<Integer> lis = new ArrayList<>();
            for(int j=0;j<len;j++){
                if ((i & (1 << j)) != 0) {
                    lis.add(nums[j]);
                }
            }
            ans.add(lis);
        }
    
        return ans;
    }
}
