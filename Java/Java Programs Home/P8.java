//input two values and print the larger using ternary operator

import java.util.Scanner;
class P8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a>=b?a:b;
		System.out.println("Larger one is "+c);
	}
}

