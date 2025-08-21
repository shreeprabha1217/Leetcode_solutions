class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c)&&map.get(c)>=left){
                left=map.get(c)+1;
            }
            map.put(c,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
