class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String z=str[str.length-1];
        int len=z.length();
        return len;
    }
}
