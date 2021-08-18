
import java.util.Scanner;
class P11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,p;
		System.out.println("Enter 3 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		p=(a+b+c)/3;
		char g=p>=80?'A':p>=60?'B':p>=40?'C':'F';
		System.out.println("Grade is "+g);
	}
}
