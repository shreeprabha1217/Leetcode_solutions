class Solution {
    public int func(int[] piles,int mid){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total += Math.ceil((double) piles[i] / mid);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int total=func(piles,mid);
            if(total<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
