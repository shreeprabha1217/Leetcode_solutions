class Solution {
    public int maxProduct(int[] nums) {
       double prefix=1;
        int n=nums.length;
       int ans=Integer.MIN_VALUE;
        double suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0)
                prefix=1;
            if(suffix==0)
                suffix=1;
            prefix=(double)prefix*nums[i];
            suffix=(double)suffix*nums[n-i-1];
            ans=(int)Math.max((double)ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}
