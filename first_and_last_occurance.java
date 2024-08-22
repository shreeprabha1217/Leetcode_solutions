class Solution {
    public int firstOccurance(int[] nums,int target){
        int low=0,high=nums.length-1,first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return first;
    }
    public int lastOccurance(int[] nums,int target){
        int low=0,high=nums.length-1,last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=firstOccurance(nums,target);
        result[1]=lastOccurance(nums,target);
        return result;
    }
}
