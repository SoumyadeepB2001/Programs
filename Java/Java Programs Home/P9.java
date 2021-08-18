import java.util.Scanner;
class P9
{
	static int max(int a, int b)
	{
		int c=a>=b?a:b;
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Larger one is "+max(a,b));
	}
}
		
