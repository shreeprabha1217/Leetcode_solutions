class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums1.length];
        for(int num:nums2){
            while(!st.isEmpty()&&st.peek()<num){
                m1.put(st.pop(),num);
            }
            st.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=m1.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}
