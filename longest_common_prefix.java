class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res=strs[0];
        String res1=strs[strs.length-1];
        int index=0;
        while(index<res.length()&& index<res1.length()){
            if(res.charAt(index)==res1.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return res.substring(0,index);
    }
}
