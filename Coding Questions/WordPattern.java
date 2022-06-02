/* Problem Link= "https://leetcode.com/problems/word-pattern/".
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", s = "dog dog dog dog"
Output: false
*/

import java.util.*;
class Solutions {
    boolean wordPattern(String pattern, String s) {
        int i=0,c=0,len=pattern.length();

		ArrayList<String> h1=new ArrayList<String>();
		ArrayList<String> h2=new ArrayList<String>();
      StringTokenizer st = new StringTokenizer(s," ");  

     while (st.hasMoreTokens()) 
     { 
		String ch1=st.nextToken();
		i++;
		if(!h1.contains(ch1))
			h1.add(ch1);

		if(i<=len)
			if(!h2.contains(Character.toString(pattern.charAt(c))))	
				h2.add(Character.toString(pattern.charAt(c)));  
        c++;     
     }  

	// System.out.println(h1);
	// System.out.println(h2);
	// System.out.println(i); 

    if(h1.size()!=h2.size() || i!=len)
        return false;
    else
        {
			c=0;
			s=s+" ";
            for(i=0;i<h1.size();i++)
            {
                s=s.replace(h1.get(i)+" ",Integer.toString(c));
				pattern=pattern.replace(h2.get(i),Integer.toString(c));
				c++;
            }
		//	s=s.replace(" ","");
			
			System.out.println(s);
        	System.out.println(pattern);	

			if(s.equals(pattern))
				return true;
			else
				return false;
        }    

	/*System.out.println("Testing...");
        System.out.println(h1);
        System.out.println(h2); */
    //    return true;
}

	public static void main(String[] args) {
		Solutions ob=new Solutions();
		System.out.println(ob.wordPattern("syys","a abc abc a"));
	}
}