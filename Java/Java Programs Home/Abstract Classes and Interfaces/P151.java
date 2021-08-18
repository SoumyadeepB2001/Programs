/* 
area of rectangle, triangle, circle using runtime polymorphism
override area()
overload input()
*/

import java.util.*;
abstract class shape
{
	int a,b,c;
	double area;
	abstract void area();
	abstract void print();
}

class rectangle extends shape
{
	void input(int length, int breadth)
	{
		a=length;
		b=breadth;
	}
	
	void area()
	{
		area = a*b;
	}
	
	void print()
	{
		area = a*b;
		System.out.println("Area of rectangle is "+area);
	}	
}

class circle extends shape
{
	void input(int r)
	{
		a=r;
	}
	
	void area()
	{
		area = (Math.PI)*a*a;
		System.out.println("Area of circle is "+area);
	}	
	
	void print()
	{
		area = (Math.PI)*a*a;
		System.out.println("Area of circle is "+area);
	}
}

class triangle extends shape
{
	void input(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	void area()
	{
		int s=(a+b+c)/2;
		area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+area);
	}
	
	void print()
	{
		int s=(a+b+c)/2;
		area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+area);
	}	
}

class P151
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		rectangle ob2 = new rectangle();
		circle ob3 = new circle();
		triangle ob4 = new triangle();
		
		shape ob;
		ob = ob2;  //object cannot be created using new keyword but using the reference of sub class
		
		System.out.println("Enter 1 for the area of rectangle");
		System.out.println("Enter 2 for the area of circle");
		System.out.println("Enter 3 for the area of triangle");
		int ch = sc.nextInt();
		int x,y,z;
		
		switch(ch)
		{
			case 1:
			System.out.println("Enter the length and breadth");
			x=sc.nextInt();
			y=sc.nextInt();
			ob2.input(x,y);
			ob.area();
			ob.print();
			break;
			
			case 2:
			System.out.println("Enter the radius");
			x=sc.nextInt();
			ob3.input(x);
			ob3.area();
			break;
			case 3:
			
			System.out.println("Enter the three sides");
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			ob4.input(x,y,z);
			ob4.area();
			break;
			
			default:
			System.out.println("Wrong Input");
		}
	}
}
