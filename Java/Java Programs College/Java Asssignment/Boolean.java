import java.util.*;
class Boolean
{
	public static void main(String[] args) 
	{
		boolean t=true,f=false;
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("n1 > n2 = "+(n1>n2));
		System.out.println("n2 > n1 = "+(n2>n1));
		System.out.println("n1 == n2 = "+(n1==n2));
		System.out.println("t = "+t);
		System.out.println("f = "+f);
	}
}