class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(smallest(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }

    public int smallest(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i] + mid - 1) / mid;
        }
        return sum;
    }
}

