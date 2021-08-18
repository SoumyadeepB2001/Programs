import java.util.Scanner;
class P64
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer(5);	//capacity = 5, but length = 0
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
	}
}
