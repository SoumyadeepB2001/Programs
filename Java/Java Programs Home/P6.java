import java.util.Scanner;
class P6
{
	void add()		//no return type no arguments
	{
		Scanner sc=new Scanner(System.in);
		int a,b,sum;
		System.out.println("Enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum of the 2 numbers is "+sum);
	}
	void sub(int a, int b)		//no return type with arguments
	{
		int c=a-b;
		System.out.println("Subtraction is "+c);
	}
	int multiplication()		//with return type no arguments
	{
		Scanner sc=new Scanner(System.in);
		int a,b,prod;
		System.out.println("Enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		prod=a*b;
		return prod;
	}
	int division(int a, int b)		//with return type with arguments
	{
		int div=a/b;
		return div;
	}	
	public static void main(String args[])
	{
		P6 ob=new P6();
		ob.add();
		ob.sub(5,3);
		int value=ob.multiplication();
		System.out.println("Multiplication is "+value);
		System.out.println("Division is "+ob.division(10,2));
	}
}

