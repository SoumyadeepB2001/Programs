import java.util.Scanner;
class P65
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer(3);	//capacity = 5, but length = 0
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.append("a");		//add at the end
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.append("b");		//add at the end
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.append("c");		//add at the end
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.append("d");		//add at the end
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.append("efghij");	//add at the end
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
	}
}
