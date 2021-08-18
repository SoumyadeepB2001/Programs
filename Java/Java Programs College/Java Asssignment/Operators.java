import java.util.Scanner;
class Operators
{
	public static void main(String args[])
	{
		int x,y,s;
		boolean t=true,f=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("\nArithmetic Operators");
		System.out.println("x + y = "+ (x+y));
		System.out.println("x - y = "+ (x-y));
		System.out.println("x * y = "+ (x*y));
		System.out.println("x / y = "+ (x/y));
		System.out.println("x % y = "+ (x%y));
		System.out.println("\nBitwise Shift Operators");
		System.out.println("Left Shift Operator x << 2 = "+(x<<2)+"  y << 2 = "+(y<<2));
		System.out.println("Right Shift Operator x >> 2 = "+(x>>2)+"  y >> 2 = "+(y>>2));
		System.out.println("Zero Fill Right Shift Operator x >>> 2 = "+(x>>>2)+"  y >>> 2 = "+(y>>>2));
		System.out.println("\nBitwise AND Operator");
		System.out.println("x & y = "+(x&y));
		System.out.println("\nBitwise OR Operator");
		System.out.println("x | y = "+(x|y));
		System.out.println("\nBitwise XOR Operator");
		System.out.println("x ^ y = "+(x^y));
		System.out.println("\nBitwise OR Operator");
		System.out.println("x | y = "+(x|y));
		System.out.println("\nBitwise ~ Operator");
		System.out.println("~x = "+(~x)+" ~y = "+(~y));
		System.out.println("\nBitwise ! Operator");
		System.out.println("!true = "+(!t)+" !false = "+(!f));
		System.out.println("\nUnary Postfix Operators");
		System.out.println("x++ = "+(x++)+"  y++ = "+(y++));
		System.out.println("\nUnary Prefix Operators");
		System.out.println("++x = "+(++x)+"  ++y = "+(++y));
		System.out.println("\nRelational Operators");
		System.out.println("x > y = "+(x>y));
		System.out.println("x < y = "+(x<y));
		System.out.println("x >= y = "+(x>=y));
		System.out.println("x <= y = "+(x<=y));
		System.out.println("x == y = "+(x==y));
		System.out.println("x != y = "+(x!=y));
		System.out.println("\nAssigment Operators");
		s=x+y;
		System.out.println("Output of s = x+y is "+s);
		s+=x;
		System.out.println("Output of s+ = x is "+s);
		s-=x;
		System.out.println("Output of s- = x is "+s);
		s/=x;
		System.out.println("Output of s/ = x is "+s);
		s*=x;
		System.out.println("Output of s* = x is "+s);
		System.out.println("\nTernary Operator");
		s=x>y?x:y;
		System.out.println("Greater of the two numbers using ternary operator = "+s);
		System.out.println("\nLogical AND Operator");
		System.out.println("x>10 && y>10 = "+(x>10 && y>10));
		System.out.println("\nLogical OR Operator");
		System.out.println("x>10 || y>10 = "+(x>10 || y>10));
	}
}