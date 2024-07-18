class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int repeat=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                repeat=0;
            else{
                repeat++;
                result=Math.max(result,repeat);
            }
        }
        return result;
    }
}
