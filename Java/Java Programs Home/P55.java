//indexOf operator

import java.util.Scanner;
class P55
{
	public static void main(String args[])
	{
		String s="kolkata";
		//	  0123456
		System.out.println(s.indexOf('k'));		// 0
		System.out.println(s.lastIndexOf('k'));		// 3
		System.out.println(s.indexOf('x'));		// -1
		System.out.println(s.indexOf('k',2));		// occurence of k after index 2
		System.out.println(s.lastIndexOf('k',2));
	}
}
