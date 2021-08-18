import java.util.Scanner;
class Fact{
static int fact(int x)
{
		if(x==0 || x==1)
			return 1;
		else
			return x*fact(x-1);
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	System.out.println("Factorial of "+n+" = "+fact(n));
}
}
