class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        int end=s.length()-1;
        while(end>=0){
            while(end>=0&&s.charAt(end)==' '){
                end--;
            }
            if(end<0)
                break;
            int start=end;
            while(start>=0&&s.charAt(start)!=' '){
                start--;
            }
            for(int i=start+1;i<=end;i++){
                res.append(s.charAt(i));
            }
            res.append(" ");
            end=start;
        }
        if(res.length()>0){
            res.setLength(res.length()-1);
        }
        return res.toString();
    }
}
