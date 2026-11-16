class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0)
            return 0;
        int n=s.length();
        int[] dp=new int[n+1];
        int prev1=1;
        int prev=s.charAt(0)!='0'?1:0;
        int cur=0;
        for(int i=2;i<=n;i++){
            cur=0;
            int first=Integer.valueOf(s.substring(i-1,i));
            int second=Integer.valueOf(s.substring(i-2,i));
            if(first>=1&&first<=9){
                cur+=prev;
            }
            if(second>=10&&second<=26){
                cur+=prev1;
            }
           prev1 = prev;
           prev = cur;
        }
        return prev;
    }
}
