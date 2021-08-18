import java.util.*;

class ExpSeries 
{
	static int fact(int x) 
	{
		if (x == 1)
			return 1;
		else
			return x * fact(x - 1);
	}

	public static void main(String[] args) 
	{
		int x,n;
		double exp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		exp+=x;
		System.out.println("Enter the number of terms to be calculated");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
			exp+=Math.pow(x,i)/fact(i);
		System.out.println("e^x = "+exp);
	}
}