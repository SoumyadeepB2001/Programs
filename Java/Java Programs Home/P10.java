//input three values and print the larger using ternary operator

import java.util.Scanner;
class P10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter 3 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=a>=b?a>=c?a:c:b>=c?b:c;
		System.out.println("Larger one is "+d);
	}
}
