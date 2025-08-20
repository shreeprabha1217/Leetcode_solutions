class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int temp[]=new int[n+1];
        for(int i=2;i<n;i++){
            temp[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(temp[i]==1){
                for(int j=2*i;j<=n;j+=i){
                    temp[j]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(temp[i]==1){
                count++;
            }
            
        }
        return count;
    }
}
