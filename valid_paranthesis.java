import java.util.*;
public class Main
{
    public static boolean isValid(String s){
       Stack<Character> s1=new Stack<Character>();
	   for(char c:s.toCharArray()){
	       if(c=='(')
	        s1.push(')');
	       else if(c=='{')
	        s1.push('}');
	       else if(c=='[')
	        s1.push(']');
	       else if(s1.isEmpty() || s1.pop()!=c)
	        return false;
	   }
	   return s1.isEmpty();
    }
	public static void main(String[] args) {
	   String s="({[})";
	   System.out.println(isValid(s));
	   
	   
}
}
