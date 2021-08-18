//insert function

import java.util.Scanner;
class P66
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("abcd");
		System.out.println("String before .insert "+s);
		s.insert(0,"xyz");
		System.out.println("String after .insert "+s);
		s.insert(2,"pqr");
		System.out.println("String after .insert "+s);
		s.insert(0,true); //this is boolean true not string
		System.out.println("String after .insert "+s);
	}
}
