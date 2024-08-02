class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int count1=0,count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2!=nums[i]){
                count1=1;
                element1=nums[i];
            }
            else if(count2==0 && element1!=nums[i]){
                count2=1;
                element2=nums[i];
            }
            else if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]==element2)
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(element1==nums[i])
                count1++;
            if(element2==nums[i])
                count2++;
        }
        int minimum=(nums.length)/3+1;
        if(count1>=minimum)
            l.add(element1);
        if(count2>=minimum)
            l.add(element2);
        return l;
    }
}
