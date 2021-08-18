import java.util.*;
public class BalancedParentheses
{
	static boolean isValid(String s) {
		Stack<Character> st= new Stack<>();  
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				 st.push(s.charAt(i));
			 else if(st.isEmpty())
				 return false;
			 
			 else if(s.charAt(i)==')')
			  {
				  if(st.pop()!='(')
					  return false;
			  }
			  else if(s.charAt(i)=='}')
			  {
				  if(st.pop()!='{')
					  return false;
			  }
			  else
			  {
				  if(st.pop()!='[')
					  return false;
			  }
		 }
		 if(st.empty())
			 return true;
		 
		 return false;
	 }
	 public static void main(String[] args) {
		System.out.println(isValid("("));
		System.out.println(isValid(")}"));
		System.out.println(isValid("(())"));
		System.out.println(isValid("{[]}"));
	 }
}
