class Solution {
    public int myAtoi(String s) {
        if(s==null||s.isEmpty()){
            return 0;
        }
        s=s.trim();
        if (s.isEmpty()) return 0;
        int sign=1;
        int index=0;
        if(s.charAt(index)=='-'){
            sign=-1;
            index++;
        }else if(s.charAt(index)=='+')
            index++;
        
        return stringToInt(s,index,0L,sign);
}
public int stringToInt(String s, int index,long result,int sign){
     int INT_MAX = Integer.MAX_VALUE;
     int INT_MIN = Integer.MIN_VALUE;
    if(index>=s.length()||!Character.isDigit(s.charAt(index))){
        return (int) result*sign;
    }
    int digit=s.charAt(index)-'0';
    result=result*10+digit;
    if(sign==-1&& -result<INT_MIN){
        return INT_MIN;
    }
    if(sign==1&&result>INT_MAX)
        return INT_MAX;
    return stringToInt(s,index+1,result,sign);
}
}
