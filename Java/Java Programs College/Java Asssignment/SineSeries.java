import java.util.Scanner;
public class SineSeries
{
	static double factorial(int n) 
	{
		double fact = 1;
		for (int i = 2; i <= n; i++)
			fact = fact * i;

		return fact; 
	}
	public static void main(String[] args) 
	{
		int n;
		double sum=0,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		x=sc.nextDouble();
		System.out.print("Enter the value of n: ");
		n=sc.nextInt();
		
		for (int i = 0; i < n; i++)
			sum += (Math.pow(-1, i) * Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1);

		System.out.println("sin(x) = " + sum); 
	}	
}