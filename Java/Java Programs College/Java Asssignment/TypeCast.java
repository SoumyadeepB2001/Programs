import java.util.*;
class TypeCast 
{
	public static void main(String args[]) {
		double a, b, c, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		int sum;
		s = a + b + c;
		sum = (int) s;
		System.out.println("Original Sum = " + s);
		System.out.println("The integer part of 'a' = "+(int)a);
		System.out.println("The integer part of 'b' = "+(int)b);
		System.out.println("The integer part of 'c' = "+(int)c);
		System.out.println("Sum with only the integer part = " + sum);
	}
}