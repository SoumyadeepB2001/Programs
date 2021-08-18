//indexOf operator

import java.util.Scanner;
class P56
{
	public static void main(String args[])
	{
		String s="ababcdab";
		//	  01234567
		System.out.println(s.indexOf("ab"));		// 0
		System.out.println(s.lastIndexOf("ab"));	// 6
		System.out.println(s.indexOf("ca"));		// -1
		System.out.println(s.indexOf("ab",2));		// occurence of k after index 2  2
		System.out.println(s.lastIndexOf("ab",2));	// 2
	}
}
