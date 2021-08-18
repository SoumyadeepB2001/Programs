import java.util.Scanner;
class P62
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer();//in default constructor without parameter
		System.out.println(s);			 	//creates a blank string whose length is 0
		System.out.println(s.length());
		System.out.println(s.capacity());	//default capacity = 16
	}
}
