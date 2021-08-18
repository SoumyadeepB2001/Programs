//input a number and print the multiplication table of the number

import java.util.Scanner;
class cl
{
	int n;			//default access specfier same as public
	void input(int x)
	{
		n=x;
	}
	void output()
	{
		System.out.println("Multiplication table of "+n+": ");
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}
}

class P14
{
	public static void main(String args[])
	{
		cl ob = new cl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int x = sc.nextInt();			//Scanner class
		ob.input(x);				//cl class
		ob.output();				//cl class
	}
}
