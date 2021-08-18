/* 
area of rectangle, triangle, circle using runtime polymorphism
override area()
overload input()
*/

import java.util.*;
class shape
{
	int a,b,c;
	double area;
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
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+area);
	}	
}

class P149
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		shape ob1 = new shape();
		rectangle ob2 = new rectangle();
		circle ob3 = new circle();
		triangle ob4 = new triangle();
		
		System.out.println("Enter 1 to calculate the area of rectangle");
		System.out.println("Enter 2 to calculate the area of circle");
		System.out.println("Enter 3 to calculate the area of triangle");
		int ch = sc.nextInt();
		int x,y,z;
		
		switch(ch)
		{
			case 1:
			System.out.println("Enter the length and breadth");
			x=sc.nextInt();
			y=sc.nextInt();
			ob2.input(x,y);
			ob2.area();
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
