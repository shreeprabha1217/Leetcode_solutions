class Solution {
    public int mySqrt(int x) {
        int low=1, high=x/2;
        int square=0;
        if(x==1)
            return 1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long ans = (long) mid * mid;
            if(ans==x)
                return mid;
            else if(ans<x){
                square=mid;
                low=mid+1;
            }
            else{
                 high=mid-1;
            }
        }
        return square;
    }
}
