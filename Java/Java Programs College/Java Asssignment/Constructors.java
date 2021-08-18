import java.util.*;
class Constructors
{
	int length,breadth;
	Constructors()
	{
		length=6;breadth=5;
		System.out.println("This is a non-parameterized constructor");
		System.out.println("length = "+length+" breadth = "+breadth);
		System.out.println("Area = "+length*breadth);
	}
	Constructors(int length, int breadth)
	{
		System.out.println("This is a parameterized constructor");
		System.out.println("length = "+length+" breadth = "+breadth);
		System.out.println("Area = "+length*breadth);
	}
	public static void main(String[] args) {
		int l,b;
		Scanner sc=new Scanner(System.in);
		Constructors ob1=new Constructors();
		System.out.println("Enter length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		Constructors ob2=new Constructors(l,b);
	}
}