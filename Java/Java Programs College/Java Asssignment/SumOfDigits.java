import java.util.Scanner;
class Sum
{
	void sumOfDigits(int n)
	{
		int sum=0,r;
		System.out.print("The sum of the digits of "+n+" = ");
		while(n>0)
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.print(sum);
	}
}
public class SumOfDigits
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		Sum ob=new Sum();
		ob.sumOfDigits(num);
	}
}