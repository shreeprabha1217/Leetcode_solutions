class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] first=new int[26];
        int[] last=new int[26];
        Arrays.fill(first,s.length());
        Arrays.fill(last,-1);
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            first[ch]=Math.min(i,first[ch]);
            last[ch]=i;
        }

        List<int[]> intervals=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(last[i]==-1) continue;
            int l=first[i];
            int r=last[i];
            boolean valid=true;
            for(int j=l;j<=r;j++){
                int x=s.charAt(j)-'a';
                if(first[x]<l){
                    valid=false;
                    break;
                }
                r=Math.max(r,last[x]);
            }
            if(valid)
                intervals.add(new int[]{r,l});
        }
        intervals.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        List<String> ans = new ArrayList<>();
        int prevEnd = -1;

        for (int[] iv : intervals) {
            int r = iv[0], l = iv[1];
            if (l > prevEnd) {
                ans.add(s.substring(l, r + 1));
                prevEnd = r;
            }
        }

        return ans;

    } 
}
