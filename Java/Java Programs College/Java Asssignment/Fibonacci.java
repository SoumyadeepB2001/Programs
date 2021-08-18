import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,c,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms to be displayed");
		n=sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	} 
}