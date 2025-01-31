class Solution {
    public int romanToInt(String s) {
        if(s.length()==1){
            return charToInt(s.charAt(0));
        }
        int result=0;
        for(int i=0;i<s.length();i++){
            int s1=charToInt(s.charAt(i));
            if(i+1<s.length()){
                int s2=charToInt(s.charAt(i+1));
                if(s1>=s2){
                result+=s1;
                }
                else{
                    result+=(s2-s1);
                    i++;
                }
            }
            else{
                result+=s1;
            }
            
        }
        return result;
    }

    public int charToInt(char c) {
        switch(c){
            case 'I': 
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

        }
        return -1;

    }
}
