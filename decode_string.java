class Solution {
    public String decodeString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<StringBuilder> ans=new Stack<>();
        int number=0;
        StringBuilder current=new StringBuilder();
        for(char c:s.toCharArray()){
            if (Character.isDigit(c)) {
  number=number*10+(c-'0');
}
          
            else if(c=='['){
                st.push(number);
                ans.push(current);
                number = 0;
    current = new StringBuilder();
            }
            else if(c==']'){
                int repeat=st.pop();
                StringBuilder prev=ans.pop();
                for(int i=0;i<repeat;i++){
                    prev.append(current);
                }
                current = prev;
            }
            else {
    current.append(c);
}
        }
        return current.toString();
    }
}
