import java.util.Scanner;
class P7
{
	static int inp()
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		return a;	
	}
	public static void main(String args[])
	{
		System.out.println("Enter 2 values");
		int a,b,c;
		a=inp();
		b=inp();
		c=a+b;
		System.out.println("Sum is "+c);
	}
}

