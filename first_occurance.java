class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
        int i=haystack.indexOf(needle);
        return i;
        }
        return -1;

    }
}
